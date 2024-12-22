package ch.supsi.dti.isin.benchmark.adapter.consistenthash.binomialnew;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.function.Supplier;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import ch.supsi.dti.isin.benchmark.adapter.ConsistentHashFactoryContract;
import ch.supsi.dti.isin.benchmark.config.AlgorithmConfig;
import ch.supsi.dti.isin.consistenthash.binomialnew.BinomialNewEngine;

/**
 * Suite to test the {@link BinomialNewFactory} class.
 * 
 * @author Massimo Coluzzi
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class BinomialNewFactoryTests implements ConsistentHashFactoryContract<BinomialNewFactory>
{


    /* ******************* */
    /*  INTERFACE METHODS  */
    /* ******************* */


    /**
     * {@inheritDoc}
     */
    @Override
    public BinomialNewFactory sampleValue( AlgorithmConfig config )
    {

        return new BinomialNewFactory( config );

    }


    /* ************** */
    /*  TEST METHODS  */
    /* ************** */


    @Test
    public void default_configuration_should_return_default_engine()
    {

        final BinomialNewFactory factory = sampleValue( CONFIG );
        
        final Supplier<BinomialNewEngine> supplier = factory.createEngineInitializer( FUNCTION, NODES );
        assertNotNull( supplier );

        final BinomialNewEngine engine = supplier.get();
        assertNotNull( engine );

    }

}
