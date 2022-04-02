<%@include file="header.jsp"%>
    <h2 style="display: flex; justify-content: center; align-content: center;">Welcome to My Online Shop Home Page.</h2><br>
    <form method="get" target="_blank" action="search" style="display: flex; flex-direction: row; justify-content: center; align-content: center;">
        <input type="text" name="txt" size="30" style="margin-right: 10px;" placeholder="Please enter a search term">
        <select name="search" style="margin-right: 10px;">
            <option value="baidu">Baidu</option>
            <option value="bing">Bing</option>
            <option value="google">Google</option>
        </select>
        <input type="submit" value="Search" style="border-radius: 20px; border: 0; outline: none; background: aqua; cursor: pointer;">
    </form>
<%@include file="footer.jsp"%>