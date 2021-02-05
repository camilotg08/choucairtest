package starter.ui.Category;

import org.openqa.selenium.By;

public class CategoryForm {
    public static By ADD_BTN = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/button");
    public static By NAME_FIELD = By.name("name");
    public static By VIET_FIELD = By.name("translated[vi][name]");
    public static By RUSS_FIELD = By.name("translated[ru][name]");
    public static By ARAB_FIELD = By.name("translated[ar][name]");
    public static By FARS_FIELD = By.name("translated[fa][name]");
    public static By TURK_FIELD = By.name("translated[tr][name]");
    public static By FREN_FIELD = By.name("translated[fr][name]");
    public static By ESPN_FIELD = By.name("translated[es][name]");
    public static By GERM_FIELD = By.name("translated[de][name]");
    public static By CRE_BTN = By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]");
}
