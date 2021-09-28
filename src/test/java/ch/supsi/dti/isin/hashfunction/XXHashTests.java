package ch.supsi.dti.isin.hashfunction;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;

/**
 * Test suite for the class {@link XXHash}.
 * 
 * @author Massimo Coluzzi
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class XXHashTests implements HashFunctionContract<XXHash>
{
    
    @Override
    public XXHash sampleValue()
    {

        return new XXHash();

    }

}
