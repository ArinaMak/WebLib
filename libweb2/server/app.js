const mysql = require('mysql');


//конфигурация

const conn = mysql.createConnection({
    host: "localhost",
    user: "root",
    database: "libweb",
    password: "AcbD1324_"
});

conn.connect(err => {
    if (err) {
        console.log('NOOOOO IT IS ERROR')
        console.log(err);
        return err;
    }
    else {
        console.log('Database .... ok');
    }
});

let query="SELECT * FROM libweb.publishing_house"

conn.query(query, (err, result, field) => {
    console.log(err);
    console.log(result);
    console.log(result[0]['title']);
    //console.log(field);
});

conn.end(err => {
    if (err) {
        console.log('NOOOOO IT IS ERROR')
        console.log(err);
        return err;
    }
    else {
        console.log('Database .... close');
    }
});