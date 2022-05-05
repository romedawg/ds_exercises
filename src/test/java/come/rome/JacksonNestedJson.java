package come.rome;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JacksonNestedJson {

//    @Test
//    public void testNestedData() throws JsonProcessingException {
//
//
//        String data = getJsonDoc();
//        Product product = new ObjectMapper().readerFor(Product.class).readValue(data);
//
//        Assertions.assertEquals(product.getName(), "The Best Product");
//        Assertions.assertEquals(product.getBrandName(), "ACME Products");
//        Assertions.assertEquals(product.getOwnerName(), "Ultimate Corp, Inc.");
//
//    }


    public String getJsonDoc(){
        String data = new String();

        String fileName = System.getProperty("user.dir")+"/src/test/java/com/rome/nested_json.json";
        Path path = Paths.get(fileName);
        if (Files.notExists(path)){
            System.out.println("file does not exist " + path);
        }

        try {
            data = new String(Files.readAllBytes(path));
        } catch (Exception e){
            System.out.println("failed to read file: " + fileName);
            e.printStackTrace();
        }

        return data;

    }
}




