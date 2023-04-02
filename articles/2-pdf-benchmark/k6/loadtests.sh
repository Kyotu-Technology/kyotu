docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3001/generate-pdf-wkhtmltopdf - <sequential.js
docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3001/generate-pdf-wkhtmltopdf - <concurrent.js

docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3000/generate-pdf-puppeteer - <sequential.js
docker run --rm -i --network="host" grafana/k6 run -e URL=http://localhost:3000/generate-pdf-puppeteer - <concurrent.js

