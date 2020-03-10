import http from 'k6/http';
import {sleep} from 'k6';

export let options = {
    stages: [
        { duration: '20s', target: 10},
        { duration: '40s', target: 100},
        { duration: '20s', target: 400}
    ]
}

export default function(){
    http.get("http://localhost:8080/greeting/russian");
    sleep(1);
}
