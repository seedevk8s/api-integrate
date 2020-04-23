import React, { useEffect, useReducer } from 'react';
import axios from 'axios';

/* useState 와 useEffect 로 데이터 로딩하기*/

/* useState 를 사용하여 요청 상태를 관리하고,
useEffect 를 사용하여 컴포넌트가 렌더링되는 시점에 요청을 시작하는 작업을 해보겠습니다.*/

/*요청에 대한 상태를 관리 할 때에는 다음과 같이 총 3가지 상태를 관리해주어야합니다.
:   요청의 결과
    로딩 상태
    에러*/

function reducer(state, action) {
    switch (action.type) {
        case 'LOADING':
            return {
                loading: true,
                data: null,
                error: null
            };
        case 'SUCCESS':
            return {
                loading: false,
                data: action.data,
                error: null
            };
        case 'ERROR':
            return {
                loading: false,
                data: null,
                error: action.error
            }
        default:
            throw new Error(`Unhandled action type: ${action.type}`);
    }
}

function Users() {

    const [state, dispatch] = useReducer(reducer, {
        loading: false,
        data: null,
        error: null
    });

    const fetchUsers = async () => {
        dispatch({ type: 'LOADING'});
        try {

            const response = await axios.get('https://jsonplaceholder.typicode.com/users');
            // 데이터는 response.data 안에 들어있습니다.
            dispatch({ type: 'SUCCESS', data: response.data});

        } catch (e) {
            dispatch({ type: 'ERROR', error: e});
        }

    };

    useEffect(() => {
        fetchUsers();
    }, []);

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
            <button onClick={fetchUsers}>다시 불러오기</button>
        </>
    );
}

export default Users;
