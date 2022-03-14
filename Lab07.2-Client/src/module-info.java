/**
 * This is the client java module, and it consists of packages:
 *  com.entertainment.client
 *  As the "client module" it does not export anything.
 *  BUT it does need to declare a dependency on the "business" MODULE com.entertainment
 */
module com.entertainment.client {
    // what other JAVA MODULES does this Java module depend on?
    // In this module, the classes have access to only the exported PACKAGES in module com.entertainment
    requires com.entertainment;
}