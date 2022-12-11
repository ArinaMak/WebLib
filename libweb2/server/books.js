const {connectingToDB} = require('./connectingToDB')

const db = connectingToDB();

function addNewBook(req, res) {
    const title = req.body.title;
    const description = req.body.description;
    const section = req.body.section;
    const publishing_house = req.body.publishing_house;
    const year_of_publication = req.body.year_of_publication;

    db.query(
        "INSERT INTO libweb.book (title, description, section, publishin_house, year_of_publication) VALUES (?,?,?,?,?)",
        [title, description, section, publishing_house, year_of_publication],
        (err, result) => {
            if (err) {
                console.log(err);
                throw new Error('BROKEN')
            } else {
                res.send("Values inserted!!!");
                console.log("hellloooooooooo");
            }
        }
    );

};

module.exports = {
  addNewBook
};