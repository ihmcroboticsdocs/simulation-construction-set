package us.ihmc.simulationconstructionset.util.ground;

import org.junit.Test;

import us.ihmc.continuousIntegration.ContinuousIntegrationAnnotations.ContinuousIntegrationTest;
import us.ihmc.jMonkeyEngineToolkit.GroundProfile3D;
import us.ihmc.simulationconstructionset.util.ground.BumpyGroundProfile;

public class BumpyGroundProfileTest extends GroundProfileTest
{
   @Override
   @ContinuousIntegrationTest(estimatedDuration = 0.1)
   @Test(timeout=300000)
   public void testSurfaceNormalGridForSmoothTerrainUsingHeightMap()
   {
      super.testSurfaceNormalGridForSmoothTerrainUsingHeightMap();
   }
   
   @Override
   public GroundProfile3D getGroundProfile()
   {
      return new BumpyGroundProfile();
   }
   
   @Override
   public double getMaxPercentageOfAllowableValleyPoints()
   {
      return 0.0;
   }

   @Override
   public double getMaxPercentageOfAllowablePeakPoints()
   {
      return 0.0;
   }
   
   @Override
   public double getMaxPercentageOfAllowableDropOffs()
   {
      return 0.0;
   }
}
