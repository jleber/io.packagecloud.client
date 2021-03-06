package io.packagecloud.client;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;
import org.simpleframework.http.Status;
import org.simpleframework.http.core.Container;

import java.io.IOException;
import java.io.PrintStream;

/*
 * Fake packagecloud server, used for testing
 */
public class PackageCloudApp implements Container {

    private void standardHeaders(Response response) {
        long time = System.currentTimeMillis();
        response.setValue("Content-Type", "application/json");
        response.setValue("Server", "PackageCloudApp/1.0 (Simple 4.0)");
        response.setDate("Date", time);
        response.setDate("Last-Modified", time);
    }

    private void getDistributions(Request request, Response response) throws IOException {
        PrintStream body = response.getPrintStream();

        String json = "{\"deb\":[{\"display_name\":\"Ubuntu\",\"index_name\":\"ubuntu\",\"versions\":[{\"id\":1,\"display_name\":\"4.10 Warty Warthog\",\"index_name\":\"warty\",\"version_number\":\"4.10\"},{\"id\":2,\"display_name\":\"5.04 Hoary Hedgehog\",\"index_name\":\"hoary\",\"version_number\":\"5.04\"},{\"id\":3,\"display_name\":\"5.10 Breezy Badger\",\"index_name\":\"breezy\",\"version_number\":\"5.10\"},{\"id\":4,\"display_name\":\"6.06 LTS Dapper Drake\",\"index_name\":\"dapper\",\"version_number\":\"6.06\"},{\"id\":5,\"display_name\":\"6.10 Edgy Eft\",\"index_name\":\"edgy\",\"version_number\":\"6.10\"},{\"id\":6,\"display_name\":\"7.04 Feisty Fawn\",\"index_name\":\"feisty\",\"version_number\":\"7.04\"},{\"id\":7,\"display_name\":\"7.10 Gutsy Gibbon\",\"index_name\":\"gutsy\",\"version_number\":\"7.10\"},{\"id\":8,\"display_name\":\"8.04 LTS Hardy Heron\",\"index_name\":\"hardy\",\"version_number\":\"8.04\"},{\"id\":9,\"display_name\":\"8.10 Intrepid Ibex\",\"index_name\":\"intrepid\",\"version_number\":\"8.10\"},{\"id\":10,\"display_name\":\"9.04 Jaunty Jackalope\",\"index_name\":\"jaunty\",\"version_number\":\"9.04\"},{\"id\":11,\"display_name\":\"9.10 Karmic Koala\",\"index_name\":\"karmic\",\"version_number\":\"9.10\"},{\"id\":12,\"display_name\":\"10.04 LTS Lucid Lynx\",\"index_name\":\"lucid\",\"version_number\":\"10.04\"},{\"id\":13,\"display_name\":\"10.10 Maverick Meerkat\",\"index_name\":\"maverick\",\"version_number\":\"10.10\"},{\"id\":14,\"display_name\":\"11.04 Natty Narwhal\",\"index_name\":\"natty\",\"version_number\":\"11.04\"},{\"id\":15,\"display_name\":\"11.10 Oneiric Ocelot\",\"index_name\":\"oneiric\",\"version_number\":\"11.10\"},{\"id\":16,\"display_name\":\"12.04 LTS Precise Pangolin\",\"index_name\":\"precise\",\"version_number\":\"12.04\"},{\"id\":17,\"display_name\":\"12.10 Quantal Quetzal\",\"index_name\":\"quantal\",\"version_number\":\"12.10\"},{\"id\":18,\"display_name\":\"13.04 Raring Ringtail\",\"index_name\":\"raring\",\"version_number\":\"13.04\"},{\"id\":19,\"display_name\":\"13.10 Saucy Salamander\",\"index_name\":\"saucy\",\"version_number\":\"13.10\"},{\"id\":20,\"display_name\":\"14.04 LTS Trusty Tahr\",\"index_name\":\"trusty\",\"version_number\":\"14.04\"},{\"id\":142,\"display_name\":\"14.10 Utopic Unicorn\",\"index_name\":\"utopic\",\"version_number\":\"14.10\"},{\"id\":148,\"display_name\":\"15.04 Vivid Vervet\",\"index_name\":\"vivid\",\"version_number\":\"15.04\"},{\"id\":152,\"display_name\":\"15.10 Wily Werewolf\",\"index_name\":\"wily\",\"version_number\":\"15.10\"},{\"id\":165,\"display_name\":\"16.04 LTS Xenial Xerus\",\"index_name\":\"xenial\",\"version_number\":\"16.04\"}]},{\"display_name\":\"Debian\",\"index_name\":\"debian\",\"versions\":[{\"id\":21,\"display_name\":\"4.0 etch\",\"index_name\":\"etch\",\"version_number\":\"4.0\"},{\"id\":22,\"display_name\":\"5.0 lenny\",\"index_name\":\"lenny\",\"version_number\":\"5.0\"},{\"id\":23,\"display_name\":\"6.0 squeeze\",\"index_name\":\"squeeze\",\"version_number\":\"6.0\"},{\"id\":24,\"display_name\":\"7 wheezy\",\"index_name\":\"wheezy\",\"version_number\":\"7.0\"},{\"id\":25,\"display_name\":\"8 jessie\",\"index_name\":\"jessie\",\"version_number\":\"8.0\"},{\"id\":149,\"display_name\":\"9 stretch\",\"index_name\":\"stretch\",\"version_number\":\"9.0\"},{\"id\":150,\"display_name\":\"10 buster\",\"index_name\":\"buster\",\"version_number\":\"10.0\"}]},{\"display_name\":\"Any deb-based distribution.\",\"index_name\":\"any\",\"versions\":[{\"id\":35,\"display_name\":\"Any version.\",\"index_name\":\"any\",\"version_number\":null}]},{\"display_name\":\"LinuxMint\",\"index_name\":\"linuxmint\",\"versions\":[{\"id\":157,\"display_name\":\"16 petra\",\"index_name\":\"petra\",\"version_number\":\"16\"},{\"id\":158,\"display_name\":\"17 qiana\",\"index_name\":\"qiana\",\"version_number\":\"17\"},{\"id\":159,\"display_name\":\"17.1 rebecca\",\"index_name\":\"rebecca\",\"version_number\":\"17.1\"},{\"id\":160,\"display_name\":\"17.2 rafaela\",\"index_name\":\"rafaela\",\"version_number\":\"17.2\"},{\"id\":161,\"display_name\":\"17.3 rosa\",\"index_name\":\"rosa\",\"version_number\":\"17.3\"}]},{\"display_name\":\"Raspbian\",\"index_name\":\"raspbian\",\"versions\":[{\"id\":153,\"display_name\":\"7 wheezy\",\"index_name\":\"wheezy\",\"version_number\":\"7.0\"},{\"id\":154,\"display_name\":\"8 jessie\",\"index_name\":\"jessie\",\"version_number\":\"8.0\"},{\"id\":155,\"display_name\":\"9 stretch\",\"index_name\":\"stretch\",\"version_number\":\"9.0\"},{\"id\":156,\"display_name\":\"10 buster\",\"index_name\":\"buster\",\"version_number\":\"10.0\"}]},{\"display_name\":\"elementary OS\",\"index_name\":\"elementaryos\",\"versions\":[{\"id\":162,\"display_name\":\"0.1 jupiter\",\"index_name\":\"jupiter\",\"version_number\":\"0.1\"},{\"id\":163,\"display_name\":\"0.2 luna\",\"index_name\":\"luna\",\"version_number\":\"0.2\"},{\"id\":164,\"display_name\":\"0.3 freya\",\"index_name\":\"freya\",\"version_number\":\"0.3\"}]}],\"rpm\":[{\"display_name\":\"Enterprise Linux\",\"index_name\":\"el\",\"versions\":[{\"id\":26,\"display_name\":\"Enterprise Linux 5.0\",\"index_name\":\"5\",\"version_number\":\"5.0\"},{\"id\":27,\"display_name\":\"Enterprise Linux 6.0\",\"index_name\":\"6\",\"version_number\":\"6.0\"},{\"id\":140,\"display_name\":\"Enterprise Linux 7.0\",\"index_name\":\"7\",\"version_number\":\"7.0\"}]},{\"display_name\":\"Fedora\",\"index_name\":\"fedora\",\"versions\":[{\"id\":28,\"display_name\":\"14 Laughlin\",\"index_name\":\"14\",\"version_number\":\"14.0\"},{\"id\":29,\"display_name\":\"15 Lovelock\",\"index_name\":\"15\",\"version_number\":\"15.0\"},{\"id\":30,\"display_name\":\"16 Verne\",\"index_name\":\"16\",\"version_number\":\"16.0\"},{\"id\":31,\"display_name\":\"17 Beefy Miracle\",\"index_name\":\"17\",\"version_number\":\"17.0\"},{\"id\":32,\"display_name\":\"18 Spherical Cow\",\"index_name\":\"18\",\"version_number\":\"18.0\"},{\"id\":33,\"display_name\":\"19 Schrödinger's Cat\",\"index_name\":\"19\",\"version_number\":\"19.0\"},{\"id\":34,\"display_name\":\"20 Heisenbug\",\"index_name\":\"20\",\"version_number\":\"20.0\"},{\"id\":143,\"display_name\":\"21 Fedora 21\",\"index_name\":\"21\",\"version_number\":\"21.0\"},{\"id\":147,\"display_name\":\"22 Fedora 22\",\"index_name\":\"22\",\"version_number\":\"22.0\"},{\"id\":151,\"display_name\":\"23 Fedora 23\",\"index_name\":\"23\",\"version_number\":\"23.0\"}]},{\"display_name\":\"Scientific Linux\",\"index_name\":\"scientific\",\"versions\":[{\"id\":138,\"display_name\":\"Scientific Linux 5.0\",\"index_name\":\"5\",\"version_number\":\"5.0\"},{\"id\":139,\"display_name\":\"Scientific Linux 6.0\",\"index_name\":\"6\",\"version_number\":\"6.0\"},{\"id\":141,\"display_name\":\"Scientific Linux 7.0\",\"index_name\":\"7\",\"version_number\":\"7.0\"}]},{\"display_name\":\"Oracle Linux\",\"index_name\":\"ol\",\"versions\":[{\"id\":144,\"display_name\":\"Oracle Linux 5.0\",\"index_name\":\"5\",\"version_number\":\"5.0\"},{\"id\":145,\"display_name\":\"Oracle Linux 6.0\",\"index_name\":\"6\",\"version_number\":\"6.0\"},{\"id\":146,\"display_name\":\"Oracle Linux 7.0\",\"index_name\":\"7\",\"version_number\":\"7.0\"}]}],\"py\":[{\"display_name\":\"Python\",\"index_name\":\"python\",\"versions\":[{\"id\":166,\"display_name\":\"Python\"}]}],\"dsc\":[{\"display_name\":\"Ubuntu\",\"index_name\":\"ubuntu\",\"versions\":[{\"id\":1,\"display_name\":\"4.10 Warty Warthog\",\"index_name\":\"warty\",\"version_number\":\"4.10\"},{\"id\":2,\"display_name\":\"5.04 Hoary Hedgehog\",\"index_name\":\"hoary\",\"version_number\":\"5.04\"},{\"id\":3,\"display_name\":\"5.10 Breezy Badger\",\"index_name\":\"breezy\",\"version_number\":\"5.10\"},{\"id\":4,\"display_name\":\"6.06 LTS Dapper Drake\",\"index_name\":\"dapper\",\"version_number\":\"6.06\"},{\"id\":5,\"display_name\":\"6.10 Edgy Eft\",\"index_name\":\"edgy\",\"version_number\":\"6.10\"},{\"id\":6,\"display_name\":\"7.04 Feisty Fawn\",\"index_name\":\"feisty\",\"version_number\":\"7.04\"},{\"id\":7,\"display_name\":\"7.10 Gutsy Gibbon\",\"index_name\":\"gutsy\",\"version_number\":\"7.10\"},{\"id\":8,\"display_name\":\"8.04 LTS Hardy Heron\",\"index_name\":\"hardy\",\"version_number\":\"8.04\"},{\"id\":9,\"display_name\":\"8.10 Intrepid Ibex\",\"index_name\":\"intrepid\",\"version_number\":\"8.10\"},{\"id\":10,\"display_name\":\"9.04 Jaunty Jackalope\",\"index_name\":\"jaunty\",\"version_number\":\"9.04\"},{\"id\":11,\"display_name\":\"9.10 Karmic Koala\",\"index_name\":\"karmic\",\"version_number\":\"9.10\"},{\"id\":12,\"display_name\":\"10.04 LTS Lucid Lynx\",\"index_name\":\"lucid\",\"version_number\":\"10.04\"},{\"id\":13,\"display_name\":\"10.10 Maverick Meerkat\",\"index_name\":\"maverick\",\"version_number\":\"10.10\"},{\"id\":14,\"display_name\":\"11.04 Natty Narwhal\",\"index_name\":\"natty\",\"version_number\":\"11.04\"},{\"id\":15,\"display_name\":\"11.10 Oneiric Ocelot\",\"index_name\":\"oneiric\",\"version_number\":\"11.10\"},{\"id\":16,\"display_name\":\"12.04 LTS Precise Pangolin\",\"index_name\":\"precise\",\"version_number\":\"12.04\"},{\"id\":17,\"display_name\":\"12.10 Quantal Quetzal\",\"index_name\":\"quantal\",\"version_number\":\"12.10\"},{\"id\":18,\"display_name\":\"13.04 Raring Ringtail\",\"index_name\":\"raring\",\"version_number\":\"13.04\"},{\"id\":19,\"display_name\":\"13.10 Saucy Salamander\",\"index_name\":\"saucy\",\"version_number\":\"13.10\"},{\"id\":20,\"display_name\":\"14.04 LTS Trusty Tahr\",\"index_name\":\"trusty\",\"version_number\":\"14.04\"},{\"id\":142,\"display_name\":\"14.10 Utopic Unicorn\",\"index_name\":\"utopic\",\"version_number\":\"14.10\"},{\"id\":148,\"display_name\":\"15.04 Vivid Vervet\",\"index_name\":\"vivid\",\"version_number\":\"15.04\"},{\"id\":152,\"display_name\":\"15.10 Wily Werewolf\",\"index_name\":\"wily\",\"version_number\":\"15.10\"},{\"id\":165,\"display_name\":\"16.04 LTS Xenial Xerus\",\"index_name\":\"xenial\",\"version_number\":\"16.04\"}]},{\"display_name\":\"Debian\",\"index_name\":\"debian\",\"versions\":[{\"id\":21,\"display_name\":\"4.0 etch\",\"index_name\":\"etch\",\"version_number\":\"4.0\"},{\"id\":22,\"display_name\":\"5.0 lenny\",\"index_name\":\"lenny\",\"version_number\":\"5.0\"},{\"id\":23,\"display_name\":\"6.0 squeeze\",\"index_name\":\"squeeze\",\"version_number\":\"6.0\"},{\"id\":24,\"display_name\":\"7 wheezy\",\"index_name\":\"wheezy\",\"version_number\":\"7.0\"},{\"id\":25,\"display_name\":\"8 jessie\",\"index_name\":\"jessie\",\"version_number\":\"8.0\"},{\"id\":149,\"display_name\":\"9 stretch\",\"index_name\":\"stretch\",\"version_number\":\"9.0\"},{\"id\":150,\"display_name\":\"10 buster\",\"index_name\":\"buster\",\"version_number\":\"10.0\"}]},{\"display_name\":\"Any deb-based distribution.\",\"index_name\":\"any\",\"versions\":[{\"id\":35,\"display_name\":\"Any version.\",\"index_name\":\"any\",\"version_number\":null}]},{\"display_name\":\"LinuxMint\",\"index_name\":\"linuxmint\",\"versions\":[{\"id\":157,\"display_name\":\"16 petra\",\"index_name\":\"petra\",\"version_number\":\"16\"},{\"id\":158,\"display_name\":\"17 qiana\",\"index_name\":\"qiana\",\"version_number\":\"17\"},{\"id\":159,\"display_name\":\"17.1 rebecca\",\"index_name\":\"rebecca\",\"version_number\":\"17.1\"},{\"id\":160,\"display_name\":\"17.2 rafaela\",\"index_name\":\"rafaela\",\"version_number\":\"17.2\"},{\"id\":161,\"display_name\":\"17.3 rosa\",\"index_name\":\"rosa\",\"version_number\":\"17.3\"}]},{\"display_name\":\"Raspbian\",\"index_name\":\"raspbian\",\"versions\":[{\"id\":153,\"display_name\":\"7 wheezy\",\"index_name\":\"wheezy\",\"version_number\":\"7.0\"},{\"id\":154,\"display_name\":\"8 jessie\",\"index_name\":\"jessie\",\"version_number\":\"8.0\"},{\"id\":155,\"display_name\":\"9 stretch\",\"index_name\":\"stretch\",\"version_number\":\"9.0\"},{\"id\":156,\"display_name\":\"10 buster\",\"index_name\":\"buster\",\"version_number\":\"10.0\"}]},{\"display_name\":\"elementary OS\",\"index_name\":\"elementaryos\",\"versions\":[{\"id\":162,\"display_name\":\"0.1 jupiter\",\"index_name\":\"jupiter\",\"version_number\":\"0.1\"},{\"id\":163,\"display_name\":\"0.2 luna\",\"index_name\":\"luna\",\"version_number\":\"0.2\"},{\"id\":164,\"display_name\":\"0.3 freya\",\"index_name\":\"freya\",\"version_number\":\"0.3\"}]}]}";

        standardHeaders(response);
        body.println(json);
        body.close();
    }

    private void putPackage(Request request, Response response) throws IOException {
        PrintStream body = response.getPrintStream();

        standardHeaders(response);
        body.println("{}");
        body.close();
    }

    private void packageContents(Request request, Response response) throws IOException {
        PrintStream body = response.getPrintStream();

        String json = "{\"files\":[{\"filename\":\"jake_1.0.orig.tar.bz2\",\"size\":1108,\"md5sum\":\"a7a309b55424198ee98abcb8092d7be0\"},{\"filename\":\"jake_1.0-7.debian.tar.gz\",\"size\":1571,\"md5sum\":\"0fa5395e95ddf846b419e96575ce8044\"}]}";
        standardHeaders(response);
        body.println(json);
        body.close();
    }

    public void handle(Request request, Response response) {
        String path = String.valueOf(request.getPath());
        System.out.println(request.getPath().toString());
        try {
            if (path.equals("/api/v1/distributions.json")) {
                getDistributions(request, response);
            } else if (path.endsWith("packages/contents")) {
                packageContents(request, response);
            } else if (path.startsWith("/api/v1/repos")) {
                putPackage(request, response);
            } else {
                PrintStream body = response.getPrintStream();
                response.setStatus(Status.NOT_FOUND);
                body.println("not found");
                body.close();
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            TestHttpContext cxt = TestHttpContext.getInstance();
            cxt.setRequest(request);
            cxt.setResponse(response);
        }

    }


}
