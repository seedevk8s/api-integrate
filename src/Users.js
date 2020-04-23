import React, {useState, useEffect} from 'react';
import axios from 'axios';

/* useState 와 useEffect 로 데이터 로딩하기*/

/* useState 를 사용하여 요청 상태를 관리하고,
useEffect 를 사용하여 컴포넌트가 렌더링되는 시점에 요청을 시작하는 작업을 해보겠습니다.*/

/*요청에 대한 상태를 관리 할 때에는 다음과 같이 총 3가지 상태를 관리해주어야합니다.
:   요청의 결과
    로딩 상태
    에러*/
function Users() {
    const [users, setUsers] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const fetchUsers = async () => {
        try {
            // 요청이 시작 할 때에는 error 와 users 를 초기화하고
            setError(null);
            setUsers(null);

            // loading 상태를 true 로 바꿉니다.
            setLoading(true);

            const response = await axios.get('https://jsonplaceholder.typicode.com/users');

            // 데이터는 response.data 안에 들어있습니다.
            setUsers(response.data);

        } catch (e) {
            setError(e);
        }

        setLoading(false);
    };

    useEffect(() => {
        fetchUsers();
    }, []);

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
            <button onClick={fetchUsers}>다시 불러오기</button>
        </>
    );
}

export default Users;
