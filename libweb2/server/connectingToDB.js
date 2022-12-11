const mysql = require('mysql')

function connectingToDB() {
    const db = mysql.createConnection({
        host: "localhost",
        user: "root",
        database: "libweb",
        password: "4444"
    });
    return db;
}

module.exports = {
  connectingToDB
};