﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:2.0.50727.4927
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WebApplication1.ServiceReference1 {
    using System;
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Runtime.Serialization", "3.0.0.0")]
    [System.SerializableAttribute()]
    [System.Xml.Serialization.XmlSchemaProviderAttribute("ExportSchema")]
    [System.Xml.Serialization.XmlRootAttribute(IsNullable=false)]
    public partial class Exception : object, System.Xml.Serialization.IXmlSerializable, System.ComponentModel.INotifyPropertyChanged {
        
        private System.Xml.XmlNode[] nodesField;
        
        private static System.Xml.XmlQualifiedName typeName = new System.Xml.XmlQualifiedName("Exception", "http://project1/");
        
        public System.Xml.XmlNode[] Nodes {
            get {
                return this.nodesField;
            }
            set {
                if ((object.ReferenceEquals(this.nodesField, value) != true)) {
                    this.nodesField = value;
                    this.RaisePropertyChanged("Nodes");
                }
            }
        }
        
        public event System.ComponentModel.PropertyChangedEventHandler PropertyChanged;
        
        public void ReadXml(System.Xml.XmlReader reader) {
            this.nodesField = System.Runtime.Serialization.XmlSerializableServices.ReadNodes(reader);
        }
        
        public void WriteXml(System.Xml.XmlWriter writer) {
            System.Runtime.Serialization.XmlSerializableServices.WriteNodes(writer, this.Nodes);
        }
        
        public System.Xml.Schema.XmlSchema GetSchema() {
            return null;
        }
        
        public static System.Xml.XmlQualifiedName ExportSchema(System.Xml.Schema.XmlSchemaSet schemas) {
            System.Runtime.Serialization.XmlSerializableServices.AddDefaultSchema(schemas, typeName);
            return typeName;
        }
        
        protected void RaisePropertyChanged(string propertyName) {
            System.ComponentModel.PropertyChangedEventHandler propertyChanged = this.PropertyChanged;
            if ((propertyChanged != null)) {
                propertyChanged(this, new System.ComponentModel.PropertyChangedEventArgs(propertyName));
            }
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://project1/", ConfigurationName="ServiceReference1.MyWebService1")]
    public interface MyWebService1 {
        
        // CODEGEN: Parameter 'return' requires additional schema information that cannot be captured using the parameter mode. The specific attribute is 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute()]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        WebApplication1.ServiceReference1.getNewsResponse getNews(WebApplication1.ServiceReference1.getNewsRequest request);
        
        // CODEGEN: Parameter 'return' requires additional schema information that cannot be captured using the parameter mode. The specific attribute is 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute()]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        WebApplication1.ServiceReference1.getNewsTitleResponse getNewsTitle(WebApplication1.ServiceReference1.getNewsTitleRequest request);
        
        // CODEGEN: Parameter 'return' requires additional schema information that cannot be captured using the parameter mode. The specific attribute is 'System.Xml.Serialization.XmlElementAttribute'.
        [System.ServiceModel.OperationContractAttribute(Action="", ReplyAction="*")]
        [System.ServiceModel.FaultContractAttribute(typeof(WebApplication1.ServiceReference1.Exception), Action="", Name="Exception")]
        [System.ServiceModel.XmlSerializerFormatAttribute()]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        WebApplication1.ServiceReference1.getNewsTypeResponse getNewsType(WebApplication1.ServiceReference1.getNewsTypeRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.MessageContractAttribute(WrapperName="getNews", WrapperNamespace="http://project1/", IsWrapped=true)]
    public partial class getNewsRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg0;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=1)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg1;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=2)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg2;
        
        public getNewsRequest() {
        }
        
        public getNewsRequest(string arg0, string arg1, string arg2) {
            this.arg0 = arg0;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.MessageContractAttribute(WrapperName="getNewsResponse", WrapperNamespace="http://project1/", IsWrapped=true)]
    public partial class getNewsResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string[] @return;
        
        public getNewsResponse() {
        }
        
        public getNewsResponse(string[] @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.MessageContractAttribute(WrapperName="getNewsTitle", WrapperNamespace="http://project1/", IsWrapped=true)]
    public partial class getNewsTitleRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg0;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=1)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg1;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=2)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg2;
        
        public getNewsTitleRequest() {
        }
        
        public getNewsTitleRequest(string arg0, string arg1, string arg2) {
            this.arg0 = arg0;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.MessageContractAttribute(WrapperName="getNewsTitleResponse", WrapperNamespace="http://project1/", IsWrapped=true)]
    public partial class getNewsTitleResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string[] @return;
        
        public getNewsTitleResponse() {
        }
        
        public getNewsTitleResponse(string[] @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.MessageContractAttribute(WrapperName="getNewsType", WrapperNamespace="http://project1/", IsWrapped=true)]
    public partial class getNewsTypeRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg0;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=1)]
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string arg1;
        
        public getNewsTypeRequest() {
        }
        
        public getNewsTypeRequest(string arg0, string arg1) {
            this.arg0 = arg0;
            this.arg1 = arg1;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    [System.ServiceModel.MessageContractAttribute(WrapperName="getNewsTypeResponse", WrapperNamespace="http://project1/", IsWrapped=true)]
    public partial class getNewsTypeResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://project1/", Order=0)]
        [System.Xml.Serialization.XmlElementAttribute("return", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string[] @return;
        
        public getNewsTypeResponse() {
        }
        
        public getNewsTypeResponse(string[] @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    public interface MyWebService1Channel : WebApplication1.ServiceReference1.MyWebService1, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
    public partial class MyWebService1Client : System.ServiceModel.ClientBase<WebApplication1.ServiceReference1.MyWebService1>, WebApplication1.ServiceReference1.MyWebService1 {
        
        public MyWebService1Client() {
        }
        
        public MyWebService1Client(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public MyWebService1Client(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public MyWebService1Client(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public MyWebService1Client(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WebApplication1.ServiceReference1.getNewsResponse WebApplication1.ServiceReference1.MyWebService1.getNews(WebApplication1.ServiceReference1.getNewsRequest request) {
            return base.Channel.getNews(request);
        }
        
        public string[] getNews(string arg0, string arg1, string arg2) {
            WebApplication1.ServiceReference1.getNewsRequest inValue = new WebApplication1.ServiceReference1.getNewsRequest();
            inValue.arg0 = arg0;
            inValue.arg1 = arg1;
            inValue.arg2 = arg2;
            WebApplication1.ServiceReference1.getNewsResponse retVal = ((WebApplication1.ServiceReference1.MyWebService1)(this)).getNews(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WebApplication1.ServiceReference1.getNewsTitleResponse WebApplication1.ServiceReference1.MyWebService1.getNewsTitle(WebApplication1.ServiceReference1.getNewsTitleRequest request) {
            return base.Channel.getNewsTitle(request);
        }
        
        public string[] getNewsTitle(string arg0, string arg1, string arg2) {
            WebApplication1.ServiceReference1.getNewsTitleRequest inValue = new WebApplication1.ServiceReference1.getNewsTitleRequest();
            inValue.arg0 = arg0;
            inValue.arg1 = arg1;
            inValue.arg2 = arg2;
            WebApplication1.ServiceReference1.getNewsTitleResponse retVal = ((WebApplication1.ServiceReference1.MyWebService1)(this)).getNewsTitle(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        WebApplication1.ServiceReference1.getNewsTypeResponse WebApplication1.ServiceReference1.MyWebService1.getNewsType(WebApplication1.ServiceReference1.getNewsTypeRequest request) {
            return base.Channel.getNewsType(request);
        }
        
        public string[] getNewsType(string arg0, string arg1) {
            WebApplication1.ServiceReference1.getNewsTypeRequest inValue = new WebApplication1.ServiceReference1.getNewsTypeRequest();
            inValue.arg0 = arg0;
            inValue.arg1 = arg1;
            WebApplication1.ServiceReference1.getNewsTypeResponse retVal = ((WebApplication1.ServiceReference1.MyWebService1)(this)).getNewsType(inValue);
            return retVal.@return;
        }
    }
}