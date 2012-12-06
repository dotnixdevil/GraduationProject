using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;

namespace WebApplication1
{
    public partial class _Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ServiceReference1.MyWebService1Client m = new ServiceReference1.MyWebService1Client();
            var v = m.getNewsType("tammam", "tammam");
            foreach (var item in v)
            {
                DropDownList2.Items.Add(item);

            }

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.MyWebService1Client m = new ServiceReference1.MyWebService1Client();
            var v = m.getNewsTitle("tammam", "tammam", DropDownList2.SelectedValue.ToString());
            DropDownList1.Visible = true;
            Label3.Visible = true;
            Button2.Visible = true;
            foreach (var item in v)
            {
                DropDownList1.Items.Add(item);
            }
        }

        protected void DropDownList2_SelectedIndexChanged(object sender, EventArgs e)
        {
        
        }

        protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.MyWebService1Client m = new ServiceReference1.MyWebService1Client();
            var v = m.getNews("tammam", "tammam", DropDownList1.SelectedValue.ToString());
            DropDownList1.Visible = true;
            Label4.Visible = true;
            Label2.Visible = true;
            foreach (var item in v)
            {
                Label2.Text = item;


            }
        }
    }
}
