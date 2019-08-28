DockerHub : https://cloud.docker.com/u/htkgods999/repository/docker/htkgods999/hw13-docker

port : 8090;

add author : POST library/author/add;
delete author : DELETE library/author/delete/{idAuthorToBeDeleted};
add book for author : POST library/author/add/book/{idAuthor};
update author : UPDATE library/author/update/{idAuthorForUpd};
get all authors : GET library/authors;

add book : POST library/book/add;
delete book : DELETE library/book/delete/{idDeletedBook};
update book : POST library/book/update/{idBookForUpdate};
sort books by genre : GET library/book/sortbygenre/{genre};
get all books : GET library/books;
