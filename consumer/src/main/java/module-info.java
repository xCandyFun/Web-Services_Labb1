import org.example.service.Number;

module org.example.consumer {
    requires org.example.service;
    requires org.example.provider;

    uses Number;

}