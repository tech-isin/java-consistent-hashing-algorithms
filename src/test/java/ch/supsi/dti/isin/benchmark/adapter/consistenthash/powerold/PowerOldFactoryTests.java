package ch.supsi.dti.isin.benchmark.adapter.consistenthash.powerold;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.function.Supplier;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import ch.supsi.dti.isin.benchmark.adapter.ConsistentHashFactoryContract;
import ch.supsi.dti.isin.benchmark.config.AlgorithmConfig;
import ch.supsi.dti.isin.consistenthash.powerold.PowerOldEngine;

/**
 * Suite to test the {@link PowerOldFactory} class.
 * 
 * @author Massimo Coluzzi
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class PowerOldFactoryTests implements ConsistentHashFactoryContract<PowerOldFactory>
{


    /* ******************* */
    /*  INTERFACE METHODS  */
    /* ******************* */


    /**
     * {@inheritDoc}
     */
    @Override
    public PowerOldFactory sampleValue( AlgorithmConfig config )
    {

        return new PowerOldFactory( config );

    }


    /* ************** */
    /*  TEST METHODS  */
    /* ************** */


    @Test
    public void default_configuration_should_return_default_engine()
    {

        final PowerOldFactory factory = sampleValue( CONFIG );
        
        final Supplier<PowerOldEngine> supplier = factory.createEngineInitializer( FUNCTION, NODES );
        assertNotNull( supplier );

        final PowerOldEngine engine = supplier.get();
        assertNotNull( engine );

    }

}
