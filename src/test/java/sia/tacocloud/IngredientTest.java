package sia.tacocloud;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sia.tacocloud.model.Ingredient;

import java.util.Arrays;

import static org.junit.Assert.*;
public class IngredientTest {
  private static final Logger log = LoggerFactory.getLogger(IngredientTest.class);
  @Test
  public void testTypes() throws Exception {
    log.debug(Arrays.toString(Ingredient.Type.values()));
    assertEquals(5, Ingredient.Type.values().length);
  }
}