package ch.supsi.dti.isin.benchmark.adapter.consistenthash.powerold;

import ch.supsi.dti.isin.benchmark.adapter.BucketBasedEnginePilot;
import ch.supsi.dti.isin.benchmark.adapter.ConsistentHashEnginePilot;
import ch.supsi.dti.isin.consistenthash.powerold.PowerOldEngine;


/**
 * Implementation of the {@link ConsistentHashEnginePilot} interface for the {@code PowerOld} algorithm.
 *
 * @author Massimo Coluzzi
 */
public class PowerOldEnginePilot extends BucketBasedEnginePilot
{

    /**
     * Constructor with parameters.
     *
     * @param engine the bucket-based engine to pilot
     */
    public PowerOldEnginePilot( PowerOldEngine engine )
    {

        super( engine );

    }

}
