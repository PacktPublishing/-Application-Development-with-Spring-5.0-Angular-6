conn = new Mongo();
db = conn.getDB("petStore");

// Pets
db.pet.insert({'cost' : NumberLong(5000000), 'numberInStock': 1, 'itemName': 'French Bulldog', 'pictureUrl': "https://s3-us-west-1.amazonaws.com/packt.9233.spring.course.images/french-bulldog.jpg"});
db.pet.insert({'cost' : NumberLong(10000), 'numberInStock': 5, 'itemName': 'Poodle', 'pictureUrl': "https://s3-us-west-1.amazonaws.com/packt.9233.spring.course.images/poodle.jpg"});
db.pet.insert({'cost' : NumberLong(45000), 'numberInStock': 2, 'itemName': 'Boxer', 'pictureUrl': "https://s3-us-west-1.amazonaws.com/packt.9233.spring.course.images/boxer.jpg"});
db.pet.insert({'cost' : NumberLong(1000), 'numberInStock': 10, 'itemName': 'Golden Fish', 'pictureUrl': "https://s3-us-west-1.amazonaws.com/packt.9233.spring.course.images/gold-fish.jpg"});
db.pet.insert({'cost' : NumberLong(35000), 'numberInStock': 3, 'itemName': 'Parrot', 'pictureUrl': "https://s3-us-west-1.amazonaws.com/packt.9233.spring.course.images/parrot.jpg"});

// Users
db.petStoreUser.insert({'name' : 'Aaron Peterson', 'moneyAvailable': NumberLong(100000), 'email': 'fred@yahoo.com'});
db.petStoreUser.insert({'name' : 'Joseph White', 'moneyAvailable': NumberLong(100000), 'email': 'joseph@yahoo.com'});

print('* Documents created');