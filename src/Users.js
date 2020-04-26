import React from 'react';
import axios from 'axios';
import useAsync from "./useAsync";

/* useState 와 useEffect 로 데이터 로딩하기*/

/* useState 를 사용하여 요청 상태를 관리하고,
useEffect 를 사용하여 컴포넌트가 렌더링되는 시점에 요청을 시작하는 작업을 해보겠습니다.*/

/*요청에 대한 상태를 관리 할 때에는 다음과 같이 총 3가지 상태를 관리해주어야합니다.
:   요청의 결과
    로딩 상태
    에러*/

// useAsync 에서는 Promise 의 결과를 바로 data 에 담기 때문에,
// 요청을 한 이후 response 에서 data 추출하여 반환하는 함수를 따로 만들었습니다.

async function getUsers() {
    const response = await axios.get(
        'https://jsonplaceholder.typicode.com/users'
    );
    return response.data;
}

function Users() {

    const [state, refetch] = useAsync(getUsers, []);

    const { loading, data: users, error } = state;  // state.data 를 users 키워드로 조회

    if (loading) return <div>로딩중.....</div>;
    if (error) return <div>에러가 발생했습니다!</div>
    if (!users) return null;

    return (
        <>
            <ul>
                {
                    users.map(user => (
                        <li key={user.id}>
                            {user.username} ({user.name})
                        </li>
                    ))
                }

            </ul>
            <button onClick={refetch}>다시 불러오기</button>
        </>
    );
}

export default Users;
