#bash

while true; do docker stats nodejs-wkhtmltopdf --no-stream | awk '{ print strftime("%Y-%m-%d %H:%M:%S"), $0 }' >> docker_stats_wkhtmltopdf.txt; sleep 1; done
