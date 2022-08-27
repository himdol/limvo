import React, { useEffect, useState } from 'react';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import { Button, ButtonGroup, Dropdown } from 'react-bootstrap';
import axios from 'axios';

function App() {
    const [hello, setHello] = useState('');
    const [kakaologin, setkakaologin] = useState('');

    useEffect(() => {
        axios
            .get('/api/index')
            .then((response) => setHello(response.data))
            .catch((error) => console.log(error));
    }, []);

    return (
        <>
            <div>백엔드에서 가져온 데이터입니다 : {hello}</div>
            <div>
                <Button>이거됨?</Button>
            </div>
            <div>
                <a></a>
                <Button>
                    <img src="/kakaoimg/kakao_login_medium_narrow.png"></img>
                </Button>
            </div>
            <div>카카오 로그인 서비스 성공 : {kakaologin}</div>
            <Form>
                <Row>
                    <Col>
                        <Form.Control placeholder="First name" />
                    </Col>
                    <Col>
                        <Form.Control placeholder="Last name" />
                    </Col>
                </Row>
            </Form>
        </>
    );
}

export default App;
