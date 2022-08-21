import React, {useEffect, useState} from 'react';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import { Button, ButtonGroup, Dropdown } from "react-bootstrap";
import axios from 'axios';

function App() {
    const [hello, setHello] = useState('')

    useEffect(() => {
    axios.get('/api/index')
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
    }, []);

    return (
        <>
            <div>
                백엔드에서 가져온 데이터입니다 : {hello}
            </div>
            <div>
                <Button>이거됨?</Button>
            </div>
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