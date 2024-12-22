package ch.supsi.dti.isin.benchmark.adapter.consistenthash.binomialnew;

import ch.supsi.dti.isin.benchmark.adapter.BucketBasedEnginePilot;
import ch.supsi.dti.isin.benchmark.adapter.ConsistentHashEnginePilot;
import ch.supsi.dti.isin.consistenthash.binomialnew.BinomialNewEngine;


/**
 * Implementation of the {@link ConsistentHashEnginePilot} interface for the {@code BinomialNew} algorithm.
 *
 * @author Massimo Coluzzi
 */
public class BinomialNewEnginePilot extends BucketBasedEnginePilot
{

    /**
     * Constructor with parameters.
     *
     * @param engine the bucket-based engine to pilot
     */
    public BinomialNewEnginePilot( BinomialNewEngine engine )
    {

        super( engine );

    }

}
