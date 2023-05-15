package petshop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

public enum Mammals  {
    DOG,CAT,RABBIT,GUINEAPIG,HAMSTER,MOUSE;

    private static final Logger logger = LogManager.getLogger(String.valueOf(Mammals.class));

    public Marker rodents()
    {
        logger.info("This animal has robust body,short limbs and long tails");
        return null;
    }

    public Marker sense()
    {
        logger.info("Rodents have well developed smell,hearing and vision");
        return null;
    }
}


