import About from "../pages/About";
import Login from "../pages/Login";
import Signin from "../pages/Signin";
import Books from "../pages/Books";
import Bookshelf from "../pages/Bookshelf";

export const privateRoutes = [
    {path: '/about', component: About, exact: true},
    {path: '/login', component: Login, exact: true},
    {path: '/signin', component: Signin, exact: true},
    {path: '/bookshelf', component: Bookshelf, exact: true},
    {path: '/books', component: Books, exact: true},
]

export const publicRoutes = [
    {path: '/login', component: Login, exact: true},
    {path: '/signin', component: Signin, exact: true},
    {path: '/about', component: About, exact: true},
    {path: '/books', component: Books, exact: true},
]
