open module com.reactive.catering.app {
    requires static lombok;

    requires spring.boot;
    requires spring.core;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires com.reactive.catering.domain;
    requires com.fasterxml.jackson.core;
//    requires java.xml.bind;

//    exports com.reactive.catering.app;
}