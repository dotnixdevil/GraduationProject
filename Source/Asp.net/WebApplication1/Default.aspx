<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="WebApplication1._Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:Image ID="Image1" runat="server" ImageUrl="~/Udotnet.jpg" />
        <br />
        <asp:Label ID="Label1" runat="server" Text="News Type"></asp:Label>
        :<br />
        <asp:DropDownList ID="DropDownList2" runat="server" 
            onselectedindexchanged="DropDownList2_SelectedIndexChanged">
        </asp:DropDownList>
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            Text="GetTitles" />
        <br />
        <asp:Label ID="Label3" runat="server" Text="Title:" Visible="False"></asp:Label>
        <br />
        <asp:DropDownList ID="DropDownList1" runat="server" 
            onselectedindexchanged="DropDownList1_SelectedIndexChanged" Visible="False">
        </asp:DropDownList>
        <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button ID="Button2" runat="server" onclick="Button2_Click" 
            style="height: 26px" Text="GetNews" Visible="False" />
        <br />
        <asp:Label ID="Label4" runat="server" Text="Subject:" Visible="False"></asp:Label>
        <br />
        <asp:Label ID="Label2" runat="server" Text="Label" Visible="False"></asp:Label>
        <br />
    
    </div>
    </form>
</body>
</html>
