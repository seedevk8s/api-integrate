import { useReducer, useEffect } from 'react';

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

/* useAsync 함수는 두가지 파라미터를 받아옵니다.
첫번째 파라미터는 API 요청을 시작하는 함수이고,
두번째 파라미터는 deps 인데 이 deps 값은 해당 함수 안에서 사용하는 useEffect 의 deps 로 설정됩니다.*/
function useAsync(callback, deps = []) {
    const [state, dispatch] = useReducer(reducer, {
        loading: false,
        data: null,
        error: false
    });

    const fetchData = async () => {
        dispatch({ type: 'LOADING' });
        try {
            const data = await callback();
            dispatch({ type: 'SUCCESS', data })
        } catch (e) {
            dispatch({ type: 'ERROR', error: e });
        }
    };

    useEffect(() => {
        fetchData();
    }, deps);

    return [state, fetchData]
}
/* 이 Hook 에서 반환하는 값은 요청 관련 상태와, fetchData 함수입니다.
이렇게 fetchData 함수를 반환하여서 나중에 데이터를 쉽게 리로딩을 해줄 수 있습니다.*/

export default useAsync;























