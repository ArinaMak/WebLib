import React, {useContext} from 'react';
import {Link} from "react-router-dom";
import MyButton from "../button/MyButton";
import {AuthContext} from "../../../context";

const Navbar = () => {
    const {isAuth, setIsAuth} = useContext(AuthContext);

    const logout = () => {
        setIsAuth(false);
        localStorage.removeItem('auth')
    }
    const login = () => {
        setIsAuth(true);
        localStorage.addItem('auth')
    }

    return (
        <div className="navbar">
            <div className="navbar__links">
                <Link to="/about">О сайте</Link>
                <Link to="/books">Книги</Link>
                <Link to="/bookshelf">Книжная полка</Link>
                <Link to="/signin">Регистрация</Link>
            </div>
            {isAuth ?
            <MyButton onClick={logout}>
                Выйти
            </MyButton> :
            <MyButton onClick={login}>
                Войти
            </MyButton>}

            <MyButton onClick={login}>
                Зарегистрироваться
            </MyButton>

        </div>
    );
};

export default Navbar;
