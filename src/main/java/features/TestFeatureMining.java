package features;

import java.io.IOException;

public class TestFeatureMining {

    /**
     * Demo that shows how we do the feature mining and output them ready for the LambdaMART step in the test file
     * the rest of the files are processed in exactly the same way.
     *
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FeatureMining fm = new FeatureMining("src/main/java/data/history.txt"); // initiate the feature mining class with the location of the historic logs
        fm.readFile("src/main/java/data/test.txt"); // read the file that we want to mine the features from
        fm.writeFeatureVectors("LambdaMART/data_lambdaMART/test.txt"); // output the features to an svmlight file ready for the LambdaMART step
    }

}
