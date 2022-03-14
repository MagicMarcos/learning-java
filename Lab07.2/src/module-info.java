/**
 * A java module is a  collection of related packages.
 * The packages in this Java module are simply the packages located with this config file.
 *  com.entertainment
 *  com.entertainment.util
 */
module com.entertainment {
    // which of my member PACKAGES are exposed to other Java modules?
    // an exported package is visible to other Java modules. (we are not exporting util)
    exports com.entertainment;
}