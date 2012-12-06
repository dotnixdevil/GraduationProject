package jsp_servlet;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __video_jspx extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/video.jspx", 1274334598574L ,"10.3.0.0","Africa/Cairo")) return true;
        return false;
    }

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final String _WL_ORIGINAL_ENCODING = "windows-1252".intern();

    private static byte[] _getBytes(String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private final static String  _wl_block0 ="<table width=\"1024\" height=\"769\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" id=\"Table_01\">";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private final static String  _wl_block1 ="</table>";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private final static String  _wl_block2 ="<tr>";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private final static String  _wl_block3 ="</tr>";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private final static String  _wl_block4 ="<td colspan=\"14\">";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private final static String  _wl_block5 ="</td>";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private final static String  _wl_block6 ="<img src=\"images/Template_01.jpg\" width=\"1024\" height=\"137\" alt=\"\"/>";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private final static String  _wl_block7 ="";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private final static String  _wl_block8 ="<td rowspan=\"4\">";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private final static String  _wl_block9 ="<img src=\"images/Template_02.jpg\" width=\"23\" height=\"383\" alt=\"\"/>";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private final static String  _wl_block10 ="<td colspan=\"3\">";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private final static String  _wl_block11 ="<a href=\"index.jspx\" target=\"_self\">";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private final static String  _wl_block12 ="</a>";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private final static String  _wl_block13 ="<img src=\"images/Template_03.jpg\" width=\"118\" height=\"39\" border=\"0\" alt=\"\"/>";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private final static String  _wl_block14 ="<td>";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private final static String  _wl_block15 ="<a href=\"video.jspx\" target=\"_self\">";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private final static String  _wl_block16 ="<img src=\"images/Template_04.jpg\" width=\"131\" height=\"39\" border=\"0\" alt=\"\"/>";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private final static String  _wl_block17 ="<td rowspan=\"2\">";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private final static String  _wl_block18 ="<img src=\"images/Template_05.jpg\" width=\"3\" height=\"85\" alt=\"\"/>";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private final static String  _wl_block19 ="<a href=\"support.jspx\" target=\"_self\">";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private final static String  _wl_block20 ="<img src=\"images/Template_06.jpg\" width=\"131\" height=\"39\" border=\"0\" alt=\"\"/>";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private final static String  _wl_block21 ="<img src=\"images/Template_07.jpg\" width=\"3\" height=\"85\" alt=\"\"/>";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private final static String  _wl_block22 ="<a href=\"rigister.jspx\" target=\"_self\">";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private final static String  _wl_block23 ="<img src=\"images/Template_08.jpg\" width=\"126\" height=\"39\" border=\"0\" alt=\"\"/>";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private final static String  _wl_block24 ="<img src=\"images/Template_09.jpg\" width=\"3\" height=\"85\" alt=\"\"/>";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private final static String  _wl_block25 ="<a href=\"about.jspx\" target=\"_self\">";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private final static String  _wl_block26 ="<img src=\"images/Template_10.jpg\" width=\"133\" height=\"39\" border=\"0\" alt=\"\"/>";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private final static String  _wl_block27 ="<td colspan=\"3\" rowspan=\"2\">";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private final static String  _wl_block28 ="<img src=\"images/Template_11.jpg\" width=\"353\" height=\"85\" alt=\"\"/>";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private final static String  _wl_block29 ="<td colspan=\"4\">";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private final static String  _wl_block30 ="<img src=\"images/Template_12.jpg\" width=\"249\" height=\"46\" alt=\"\"/>";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private final static String  _wl_block31 ="<img src=\"images/Template_13.jpg\" width=\"131\" height=\"46\" alt=\"\"/>";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private final static String  _wl_block32 ="<img src=\"images/Template_14.jpg\" width=\"126\" height=\"46\" alt=\"\"/>";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private final static String  _wl_block33 ="<img src=\"images/Template_15.jpg\" width=\"133\" height=\"46\" alt=\"\"/>";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private final static String  _wl_block34 ="<td colspan=\"2\" rowspan=\"2\">";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private final static String  _wl_block35 ="<img src=\"images/Template_16.jpg\" width=\"18\" height=\"298\" alt=\"\"/>";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private final static String  _wl_block36 ="<td colspan=\"9\">";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private final static String  _wl_block37 ="<object id=\"FlashID\" classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" width=\"936\" height=\"243\">";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private final static String  _wl_block38 ="</object>";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private final static String  _wl_block39 ="<param name=\"movie\" value=\"Movie1.swf\"/>";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private final static String  _wl_block40 ="<param name=\"quality\" value=\"high\"/>";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private final static String  _wl_block41 ="<param name=\"wmode\" value=\"opaque\"/>";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private final static String  _wl_block42 ="<param name=\"swfversion\" value=\"7.0.70.0\"/>";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private final static String  _wl_block43 ="<param name=\"expressinstall\" value=\"Scripts/expressInstall.swf\"/>";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private final static String  _wl_block44 ="<object type=\"application/x-shockwave-flash\" data=\"Movie1.swf\" width=\"936\" height=\"243\">";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private final static String  _wl_block45 ="<div>";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private final static String  _wl_block46 ="</div>";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private final static String  _wl_block47 ="<h4>";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private final static String  _wl_block48 ="</h4>";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private final static String  _wl_block49 ="\r\n                      Content on this page requires a newer version of Adobe\r\n                      Flash Player.\r\n                    ";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private final static String  _wl_block50 ="<p>";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private final static String  _wl_block51 ="</p>";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private final static String  _wl_block52 ="<a href=\"http://www.adobe.com/go/getflashplayer\">";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private final static String  _wl_block53 ="<img src=\"http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif\" alt=\"Get Adobe Flash player\"/>";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private final static String  _wl_block54 ="<img src=\"images/Template_18.jpg\" width=\"47\" height=\"298\" alt=\"\"/>";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private final static String  _wl_block55 ="<img src=\"images/Template_19.jpg\" width=\"936\" height=\"55\" alt=\"\"/>";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private final static String  _wl_block56 ="<td colspan=\"2\" style=\"background-image:url(images/Template_20.jpg)\">";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private final static String  _wl_block57 =" ";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private final static String  _wl_block58 ="<img src=\"images/Template_21.jpg\" width=\"1\" height=\"248\" alt=\"\"/>";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private final static String  _wl_block59 ="<td colspan=\"9\" align=\"left\" valign=\"top\" style=\"background-image:url(images/Template_22.jpg)\">";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private final static String  _wl_block60 ="\r\n                 \r\n              ";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private final static String  _wl_block61 ="<font color=\"#0000ff\">";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private final static String  _wl_block62 ="</font>";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private final static String  _wl_block63 ="<strong>";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private final static String  _wl_block64 ="</strong>";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private final static String  _wl_block65 ="<font color=\"#8484ff\">";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private final static String  _wl_block66 ="\r\n                        Author:\r\n                      ";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private final static String  _wl_block67 ="<div align=\"center\">";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private final static String  _wl_block68 ="\r\n                     \r\n                  ";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private final static String  _wl_block69 ="<font color=\"#7373ff\">";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private final static String  _wl_block70 ="Source:";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private final static String  _wl_block71 ="<td style=\"background-image:url(images/Template_23.jpg)\">";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private final static String  _wl_block72 ="<img src=\"images/Template_24.jpg\" width=\"8\" height=\"248\" alt=\"\"/>";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private final static String  _wl_block73 ="<td colspan=\"2\">";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private final static String  _wl_block74 ="<img src=\"images/Template_25.jpg\" width=\"40\" height=\"121\" alt=\"\"/>";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private final static String  _wl_block75 ="<td colspan=\"10\">";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private final static String  _wl_block76 ="<img src=\"images/Template_26.jpg\" width=\"975\" height=\"121\" alt=\"\"/>";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private final static String  _wl_block77 ="<img src=\"images/spacer.gif\" width=\"23\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private final static String  _wl_block78 ="<img src=\"images/spacer.gif\" width=\"17\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private final static String  _wl_block79 ="<img src=\"images/spacer.gif\" width=\"1\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private final static String  _wl_block80 ="<img src=\"images/spacer.gif\" width=\"100\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private final static String  _wl_block81 ="<img src=\"images/spacer.gif\" width=\"131\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private final static String  _wl_block82 ="<img src=\"images/spacer.gif\" width=\"3\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private final static String  _wl_block83 ="<img src=\"images/spacer.gif\" width=\"126\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private final static String  _wl_block84 ="<img src=\"images/spacer.gif\" width=\"133\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private final static String  _wl_block85 ="<img src=\"images/spacer.gif\" width=\"306\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private final static String  _wl_block86 ="<img src=\"images/spacer.gif\" width=\"39\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private final static String  _wl_block87 ="<img src=\"images/spacer.gif\" width=\"8\" height=\"1\" alt=\"\"/>";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private final static String  _wl_block88 ="<script type=\"text/javascript\">";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private final static String  _wl_block89 ="</script>";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private final static String  _wl_block90 ="\r\n<!--\r\nswfobject.registerObject(\"FlashID\");\r\n//-->\r\n";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html;charset=windows-1252");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter)out;
        bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html;charset=windows-1252");
             com.sun.faces.taglib.jsf_core.ViewTag __tag0 = null ;
            int __result__tag0 = 0 ;

            if (__tag0 == null ){
                __tag0 = new  com.sun.faces.taglib.jsf_core.ViewTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
            }
            __tag0.setPageContext(pageContext);
            __tag0.setParent(null);
            __tag0.setJspId("id0");
            _activeTag=__tag0;
            __result__tag0 = __tag0.doStartTag();

            if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                try {
                    if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                        out = pageContext.pushBody();
                        bw = (weblogic.servlet.jsp.ByteWriter)out;
                        __tag0.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                        __tag0.doInitBody();
                    }
                    do {
                         oracle.adfinternal.view.faces.unified.taglib.UnifiedDocumentTag __tag1 = null ;
                        int __result__tag1 = 0 ;

                        if (__tag1 == null ){
                            __tag1 = new  oracle.adfinternal.view.faces.unified.taglib.UnifiedDocumentTag ();
                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
                        }
                        __tag1.setPageContext(pageContext);
                        __tag1.setParent(__tag0);
                        __tag1.setJspId("id1");
                        __tag1.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.document1}",javax.faces.component.UIComponent.class,pageContext, null ));
                        __tag1.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("document1", java.lang.String .class));
                        _activeTag=__tag1;
                        __result__tag1 = __tag1.doStartTag();

                        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                            try {
                                if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                    out = pageContext.pushBody();
                                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                                    __tag1.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                    __tag1.doInitBody();
                                }
                                do {

                                    if (_jspx___tag2(request, response, pageContext, _activeTag, __tag1))
                                     return;
                                     oracle.adfinternal.view.faces.unified.taglib.UnifiedFormTag __tag3 = null ;
                                    int __result__tag3 = 0 ;

                                    if (__tag3 == null ){
                                        __tag3 = new  oracle.adfinternal.view.faces.unified.taglib.UnifiedFormTag ();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
                                    }
                                    __tag3.setPageContext(pageContext);
                                    __tag3.setParent(__tag1);
                                    __tag3.setJspId("id3");
                                    __tag3.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.form1}",javax.faces.component.UIComponent.class,pageContext, null ));
                                    __tag3.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("form1", java.lang.String .class));
                                    _activeTag=__tag3;
                                    __result__tag3 = __tag3.doStartTag();

                                    if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                        try {
                                            if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                out = pageContext.pushBody();
                                                bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                __tag3.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                                __tag3.doInitBody();
                                            }
                                            do {
                                                bw.write(_wl_block0Bytes, _wl_block0);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block4Bytes, _wl_block4);
                                                bw.write(_wl_block6Bytes, _wl_block6);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block8Bytes, _wl_block8);
                                                bw.write(_wl_block9Bytes, _wl_block9);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block10Bytes, _wl_block10);
                                                bw.write(_wl_block11Bytes, _wl_block11);
                                                bw.write(_wl_block13Bytes, _wl_block13);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block12Bytes, _wl_block12);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block15Bytes, _wl_block15);
                                                bw.write(_wl_block16Bytes, _wl_block16);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block12Bytes, _wl_block12);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block17Bytes, _wl_block17);
                                                bw.write(_wl_block18Bytes, _wl_block18);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block19Bytes, _wl_block19);
                                                bw.write(_wl_block20Bytes, _wl_block20);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block12Bytes, _wl_block12);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block17Bytes, _wl_block17);
                                                bw.write(_wl_block21Bytes, _wl_block21);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block22Bytes, _wl_block22);
                                                bw.write(_wl_block23Bytes, _wl_block23);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block12Bytes, _wl_block12);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block17Bytes, _wl_block17);
                                                bw.write(_wl_block24Bytes, _wl_block24);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block25Bytes, _wl_block25);
                                                bw.write(_wl_block26Bytes, _wl_block26);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block12Bytes, _wl_block12);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block27Bytes, _wl_block27);
                                                bw.write(_wl_block28Bytes, _wl_block28);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block29Bytes, _wl_block29);
                                                bw.write(_wl_block30Bytes, _wl_block30);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block31Bytes, _wl_block31);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block32Bytes, _wl_block32);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block33Bytes, _wl_block33);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block34Bytes, _wl_block34);
                                                bw.write(_wl_block35Bytes, _wl_block35);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block36Bytes, _wl_block36);
                                                bw.write(_wl_block37Bytes, _wl_block37);
                                                bw.write(_wl_block39Bytes, _wl_block39);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block40Bytes, _wl_block40);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block41Bytes, _wl_block41);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block42Bytes, _wl_block42);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block43Bytes, _wl_block43);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block44Bytes, _wl_block44);
                                                bw.write(_wl_block40Bytes, _wl_block40);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block41Bytes, _wl_block41);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block42Bytes, _wl_block42);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block43Bytes, _wl_block43);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block45Bytes, _wl_block45);
                                                bw.write(_wl_block47Bytes, _wl_block47);
                                                bw.write(_wl_block49Bytes, _wl_block49);
                                                bw.write(_wl_block48Bytes, _wl_block48);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block52Bytes, _wl_block52);
                                                bw.write(_wl_block53Bytes, _wl_block53);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block12Bytes, _wl_block12);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block46Bytes, _wl_block46);
                                                bw.write(_wl_block38Bytes, _wl_block38);
                                                bw.write(_wl_block38Bytes, _wl_block38);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block34Bytes, _wl_block34);
                                                bw.write(_wl_block54Bytes, _wl_block54);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block36Bytes, _wl_block36);
                                                bw.write(_wl_block55Bytes, _wl_block55);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block56Bytes, _wl_block56);
                                                bw.write(_wl_block57Bytes, _wl_block57);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block17Bytes, _wl_block17);
                                                bw.write(_wl_block58Bytes, _wl_block58);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block59Bytes, _wl_block59);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                 org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag __tag4 = null ;
                                                int __result__tag4 = 0 ;

                                                if (__tag4 == null ){
                                                    __tag4 = new  org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
                                                }
                                                __tag4.setPageContext(pageContext);
                                                __tag4.setParent(__tag3);
                                                __tag4.setJspId("id4");
                                                __tag4.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.iterator1}",java.lang.Object.class,pageContext, null ));
                                                __tag4.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("video", java.lang.String .class));
                                                __tag4.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{bindings.NewsView1.collectionModel}",java.lang.Object.class,pageContext, null ));
                                                __tag4.setVar(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("row", java.lang.String .class));
                                                _activeTag=__tag4;
                                                __result__tag4 = __tag4.doStartTag();

                                                if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    try {
                                                        if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                            out = pageContext.pushBody();
                                                            bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                            __tag4.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                                            __tag4.doInitBody();
                                                        }
                                                        do {
                                                            bw.write(_wl_block50Bytes, _wl_block50);
                                                            bw.write(_wl_block61Bytes, _wl_block61);

                                                            if (_jspx___tag5(request, response, pageContext, _activeTag, __tag4))
                                                             return;
                                                            bw.write(_wl_block62Bytes, _wl_block62);
                                                            bw.write(_wl_block51Bytes, _wl_block51);
                                                            bw.write(_wl_block50Bytes, _wl_block50);
                                                            bw.write(_wl_block63Bytes, _wl_block63);
                                                            bw.write(_wl_block65Bytes, _wl_block65);
                                                            bw.write(_wl_block66Bytes, _wl_block66);
                                                            bw.write(_wl_block62Bytes, _wl_block62);
                                                            bw.write(_wl_block64Bytes, _wl_block64);

                                                            if (_jspx___tag6(request, response, pageContext, _activeTag, __tag4))
                                                             return;

                                                            if (_jspx___tag7(request, response, pageContext, _activeTag, __tag4))
                                                             return;
                                                            bw.write(_wl_block51Bytes, _wl_block51);
                                                            bw.write(_wl_block67Bytes, _wl_block67);

                                                            if (_jspx___tag8(request, response, pageContext, _activeTag, __tag4))
                                                             return;
                                                            bw.write(_wl_block46Bytes, _wl_block46);
                                                            bw.write(_wl_block50Bytes, _wl_block50);
                                                            bw.write(_wl_block68Bytes, _wl_block68);
                                                            bw.write(_wl_block51Bytes, _wl_block51);
                                                            bw.write(_wl_block50Bytes, _wl_block50);

                                                            if (_jspx___tag9(request, response, pageContext, _activeTag, __tag4))
                                                             return;
                                                            bw.write(_wl_block69Bytes, _wl_block69);
                                                            bw.write(_wl_block63Bytes, _wl_block63);
                                                            bw.write(_wl_block70Bytes, _wl_block70);
                                                            bw.write(_wl_block64Bytes, _wl_block64);
                                                            bw.write(_wl_block62Bytes, _wl_block62);

                                                            if (_jspx___tag10(request, response, pageContext, _activeTag, __tag4))
                                                             return;
                                                            bw.write(_wl_block51Bytes, _wl_block51);
                                                            bw.write(_wl_block50Bytes, _wl_block50);
                                                            bw.write(_wl_block68Bytes, _wl_block68);
                                                            bw.write(_wl_block51Bytes, _wl_block51);
                                                        } while (__tag4.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                    } finally {
                                                        if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                            out = pageContext.popBody();
                                                            bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                        }
                                                    }
                                                }
                                                if (__tag4.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag4);
                                                    return;
                                                }
                                                _activeTag=__tag4.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag4);
                                                __tag4.release();
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block50Bytes, _wl_block50);
                                                bw.write(_wl_block60Bytes, _wl_block60);
                                                bw.write(_wl_block51Bytes, _wl_block51);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block71Bytes, _wl_block71);
                                                bw.write(_wl_block57Bytes, _wl_block57);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block17Bytes, _wl_block17);
                                                bw.write(_wl_block72Bytes, _wl_block72);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block73Bytes, _wl_block73);
                                                bw.write(_wl_block74Bytes, _wl_block74);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block75Bytes, _wl_block75);
                                                bw.write(_wl_block76Bytes, _wl_block76);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block2Bytes, _wl_block2);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block77Bytes, _wl_block77);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block78Bytes, _wl_block78);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block79Bytes, _wl_block79);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block80Bytes, _wl_block80);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block81Bytes, _wl_block81);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block82Bytes, _wl_block82);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block81Bytes, _wl_block81);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block82Bytes, _wl_block82);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block83Bytes, _wl_block83);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block82Bytes, _wl_block82);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block84Bytes, _wl_block84);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block85Bytes, _wl_block85);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block86Bytes, _wl_block86);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block14Bytes, _wl_block14);
                                                bw.write(_wl_block87Bytes, _wl_block87);
                                                bw.write(_wl_block7Bytes, _wl_block7);
                                                bw.write(_wl_block5Bytes, _wl_block5);
                                                bw.write(_wl_block3Bytes, _wl_block3);
                                                bw.write(_wl_block1Bytes, _wl_block1);
                                                bw.write(_wl_block88Bytes, _wl_block88);
                                                bw.write(_wl_block90Bytes, _wl_block90);
                                                bw.write(_wl_block89Bytes, _wl_block89);
                                            } while (__tag3.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        } finally {
                                            if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                out = pageContext.popBody();
                                                bw = (weblogic.servlet.jsp.ByteWriter)out;
                                            }
                                        }
                                    }
                                    if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                        _activeTag = null;
                                        _releaseTags(pageContext, __tag3);
                                        return;
                                    }
                                    _activeTag=__tag3.getParent();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
                                    __tag3.release();
                                } while (__tag1.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            } finally {
                                if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                    out = pageContext.popBody();
                                    bw = (weblogic.servlet.jsp.ByteWriter)out;
                                }
                            }
                        }
                        if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                            _activeTag = null;
                            _releaseTags(pageContext, __tag1);
                            return;
                        }
                        _activeTag=__tag1.getParent();
                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
                        __tag1.release();
                    } while (__tag0.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                } finally {
                    if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                        out = pageContext.popBody();
                        bw = (weblogic.servlet.jsp.ByteWriter)out;
                    }
                }
            }
            if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag0);
                return;
            }
            _activeTag=__tag0.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
            __tag0.release();
        } catch (Throwable __ee){
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        }
    }

    private boolean _jspx___tag2(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, oracle.adfinternal.view.faces.unified.taglib.UnifiedDocumentTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMessagesTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMessagesTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        __tag2.setParent(parent);
        __tag2.setJspId("id2");
        __tag2.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.messages1}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag2.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("messages1", java.lang.String .class));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag2.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag2);
            return true;
        }
        _activeTag=__tag2.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag2);
        __tag2.release();
        return false;
    }

    private boolean _jspx___tag5(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        __tag5.setParent(parent);
        __tag5.setJspId("id5");
        __tag5.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{row.Tittle}",java.lang.Object.class,pageContext, null ));
        __tag5.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.outputText1}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag5.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("outputText1", java.lang.String .class));
        __tag5.setInlineStyle( weblogic.servlet.jsp.ELHelper.createValueExpression("font-size:x-large;",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag5;
        __result__tag5 = __tag5.doStartTag();

        if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag5.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag5);
            return true;
        }
        _activeTag=__tag5.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag5);
        __tag5.release();
        return false;
    }

    private boolean _jspx___tag6(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag __tag6 = null ;
        int __result__tag6 = 0 ;

        if (__tag6 == null ){
            __tag6 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
        }
        __tag6.setPageContext(pageContext);
        __tag6.setParent(parent);
        __tag6.setJspId("id6");
        __tag6.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{row.Wname}",java.lang.Object.class,pageContext, null ));
        __tag6.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.outputText3}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag6.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("outputText3", java.lang.String .class));
        _activeTag=__tag6;
        __result__tag6 = __tag6.doStartTag();

        if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag6.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag6);
            return true;
        }
        _activeTag=__tag6.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag6);
        __tag6.release();
        return false;
    }

    private boolean _jspx___tag7(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSeparatorTag __tag7 = null ;
        int __result__tag7 = 0 ;

        if (__tag7 == null ){
            __tag7 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSeparatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
        }
        __tag7.setPageContext(pageContext);
        __tag7.setParent(parent);
        __tag7.setJspId("id7");
        __tag7.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.separator1}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag7.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("separator1", java.lang.String .class));
        _activeTag=__tag7;
        __result__tag7 = __tag7.doStartTag();

        if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag7.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag7);
            return true;
        }
        _activeTag=__tag7.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag7);
        __tag7.release();
        return false;
    }

    private boolean _jspx___tag8(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMediaTag __tag8 = null ;
        int __result__tag8 = 0 ;

        if (__tag8 == null ){
            __tag8 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedMediaTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
        }
        __tag8.setPageContext(pageContext);
        __tag8.setParent(parent);
        __tag8.setJspId("id8");
        __tag8.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.outputText21}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag8.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("outputText21", java.lang.String .class));
        __tag8.setSource( weblogic.servlet.jsp.ELHelper.createValueExpression("#{row.Img}",java.lang.Object.class,pageContext, null ));
        _activeTag=__tag8;
        __result__tag8 = __tag8.doStartTag();

        if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag8.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag8);
            return true;
        }
        _activeTag=__tag8.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag8);
        __tag8.release();
        return false;
    }

    private boolean _jspx___tag9(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSeparatorTag __tag9 = null ;
        int __result__tag9 = 0 ;

        if (__tag9 == null ){
            __tag9 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedSeparatorTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
        }
        __tag9.setPageContext(pageContext);
        __tag9.setParent(parent);
        __tag9.setJspId("id9");
        __tag9.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.separator2}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag9.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("separator2", java.lang.String .class));
        _activeTag=__tag9;
        __result__tag9 = __tag9.doStartTag();

        if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag9.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag9);
            return true;
        }
        _activeTag=__tag9.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag9);
        __tag9.release();
        return false;
    }

    private boolean _jspx___tag10(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, org.apache.myfaces.trinidadinternal.taglib.UIXIteratorTag parent) throws Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter bw = (weblogic.servlet.jsp.ByteWriter) out;
         oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  oracle.adfinternal.view.faces.unified.taglib.output.UnifiedOutputTextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        __tag10.setParent(parent);
        __tag10.setJspId("id10");
        __tag10.setValue( weblogic.servlet.jsp.ELHelper.createValueExpression("#{row.Sname}",java.lang.Object.class,pageContext, null ));
        __tag10.setBinding( weblogic.servlet.jsp.ELHelper.createValueExpression("#{backingBeanScope.backing_video.outputText4}",javax.faces.component.UIComponent.class,pageContext, null ));
        __tag10.setId(( java.lang.String ) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("outputText4", java.lang.String .class));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag10.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag10);
            return true;
        }
        _activeTag=__tag10.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag10);
        __tag10.release();
        return false;
    }
}
