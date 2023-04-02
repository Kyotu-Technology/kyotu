const express = require("express");
const wkhtmltopdf = require("wkhtmltopdf");
const app = express();
const port = 3000;

const htmlContent = `
<!DOCTYPE html>
<html>
<head>
  <title>PDF Test</title>
</head>
<body>
  <h1>Hello World</h1>
</body>
</html>
`;

app.get("/generate-pdf-wkhtmltopdf", (req, res) => {
    wkhtmltopdf(htmlContent, { pageSize: "letter" }).pipe(res);
});

app.listen(port, () => {
    console.log(`wkhtmltopdf PDF generation app listening at http://localhost:${port}`);
});
