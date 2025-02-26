const baseUrl = "http://184.72.84.208:8080";


function fetchData(endpoint, resultId) {
    fetch(`${baseUrl}${endpoint}`)
        .then(response => response.text())
        .then(data => {
            document.getElementById(resultId).textContent = data;
        })
        .catch(error => {
            console.error("Error:", error);
            document.getElementById(resultId).textContent = "Error al obtener la información.";
        });
}

function sayHello() {
    const name = document.getElementById('name-input').value;
    fetchData(`/hello?name=${encodeURIComponent(name)}`, 'hello-result');
}

function sumNumbers() {
    const num1 = document.getElementById("num1-input").value;
    const num2 = document.getElementById("num2-input").value;

    if (num1 === "" || num2 === "") {
        document.getElementById("sum-result").innerText = "Por favor, ingresa ambos números.";
        return;
    }

    fetchData(`/sum?a=${num1}&b=${num2}`, 'sum-result');
}

function getPi() { fetchData('/pi', 'pi-result'); }
function getEuler() { fetchData('/euler', 'euler-result'); }
function getTomorrow() { fetchData('/manana', 'tomorrow-result'); }
function getDateTime() { fetchData('/fecha-hora', 'datetime-result'); }
function getServerIP() { fetchData('/ip', 'server-ip-result'); }
function getSystemInfo() { fetchData('/sistema', 'system-result'); }
function getMemoryInfo() { fetchData('/memoria', 'memory-result'); }
function getAuthor() { fetchData('/autor', 'author-result'); }
