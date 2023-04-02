import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
    vus: 5,
    duration: '30s',
};

export default function () {
    const url = __ENV.URL;

    // Test endpoint
    let res = http.get(url);
    check(res, { 'PDF generated': (r) => r.status === 200 });

    sleep(0.3);
}
