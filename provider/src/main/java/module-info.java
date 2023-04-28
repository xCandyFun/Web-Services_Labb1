import org.example.provider.ProcentToNumber;
import org.example.provider.NumberToProcent;
import org.example.service.Number;

module org.example.provider {
    requires org.example.service;

    provides Number with NumberToProcent, ProcentToNumber;
}