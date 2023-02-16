import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void test1(){
        int out = Main.longest_sub_string("abcabcbb");
        Assert.assertEquals(out,3);
    }
    @Test
    public void test2(){
        int out = Main.longest_sub_string("bbbbb");
        Assert.assertEquals(out,1);
    }
    @Test
    public void test3(){
        int out = Main.longest_sub_string("pwwkew");
        Assert.assertEquals(out,3);
    }
    @Test
    public void test_null(){
        int out = Main.longest_sub_string("");
        Assert.assertEquals(out,0);
    }

    @Test
    public void test_length_1000(){
        int out = Main.longest_sub_string("9XT2rBRmKk7cvuvlrRIpjDetSm2lG3aBRiuJcLIhAFtXG698aKPFGm7tzmBQycNR9LReOZ3P" +
                "dI1aWjfpDV3snyU7KKzkLkZwjC4mqJXPybWXn0R0G3UIXvx5KWXlRP68Z6ZhvQOXAxFft4NZMj6W63k2AB34DZEDRxmQ8juBNii2N" +
                "exbgoRry9Jfk6iKM8tGHGwtfWg4heib1a8KagQvc638JLYCdxT9XfDQcTWujy1jvlueOKVmMXlBBYiPbJc4FlgY15QChlq6gsNPWs" +
                "38RbAYPGTifJgtqED9eilv8rmxyaojNCIGMT3DdmHfCl3KHTTfftvzoiw7unVSzIDUge4Um12NniH4StvI1N6DbPGcWSaWo3UsuXz" +
                "yI2G29SAi1nEGWZYBSmbLP0CYHyFvIB8ubeVUB1G0Aogd8ruuYP5BT5jaHdiXKLiZpaQ9dXBSDY5ClUJ8ZSFMGCscmY1aHDQeCwpE" +
                "7JC85CacTJsJhKSZc21tvbAH0I6xyAtD6txyMc7ucc1DKH07DxN1jXSbVB2QpxTCItQzNd8mI3z9k7Fq5JaXjS7U8D56rps7HO7U3" +
                "aSRIF3GbExCuENy0hYhbd8abSoHNUmlNTCBcarX9fkV7Uy8QZf7RttTo1Lclwk3GtAzXqwH1Vo7veuG0xgRjXqLpAv1IFurYDqk84" +
                "8XMXdyU9RRhaQ8We6hIZWNuxaARK3OO4AsJKNxvZ1vcBHMVX6iObuvX7BYjlxqFpoRrJsrA4hBo8lZn7WJNBnP58n42iISyV5ade7" +
                "F1b5ngeD1F5RgE0D9BHCfDFl3LsWQbivDsXTxOkluGfiWdL1a6yIZDTtzXI19553mtaA3nzb4fOoHTtJYlTHK73GiZK1T3Ng7eibU" +
                "9b7RPEeo3VyDef7xDiP58tSdRRl0AnbpSG6Gq5NTCoDMdktg8hKSZHmuYxXfyIgbJsITf2kAQDKiqOIoWJ4tjjH28QVxKTLayG7ta" +
                "e6f5Sun61Vojj33NjFP");
                Assert.assertEquals(out,15);
    }




}