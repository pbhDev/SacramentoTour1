package com.example.android.sacramentotour;

import java.util.ArrayList;

public class SitesAllData {

    ArrayList<SiteData> sightseeingArray = new ArrayList<>();
    ArrayList<SiteData> businessArray= new ArrayList<>();
    ArrayList<SiteData> localEventArray = new ArrayList<>();

    public SitesAllData(ArrayList<SiteData> sightseeingArray, ArrayList<SiteData> businessArray, ArrayList<SiteData> localEventArray) {
        this.sightseeingArray = sightseeingArray;
        this.businessArray = businessArray;
        this.localEventArray = localEventArray;
    }



    public ArrayList<SiteData> getSightseeingArray() {
       sightseeingArray =  new ArrayList<>();

        sightseeingArray.add(new SiteData(1,"10th Streets, Sacramento, CA 95814",
                "916-324-0333","http://assembly.ca.gov/statecapitol",
                "Capitol",R.drawable.capitol1));
        sightseeingArray.add(new SiteData(1,"38.580556°N 121.508333°W",
                "916-808-8795","http://www.cityofsacramento.org/",
                "Tower Bridge",R.drawable.goldenbridge));
        sightseeingArray.add(new SiteData(1,"3930 W Land Park Dr, Sacramento, CA 95822",
                " 916-808-5888","https://www.saczoo.org/",
                "Sacramento Zoo",R.drawable.saczoo));
        sightseeingArray.add(new SiteData(1, "125 I St, Sacramento, CA 95814",
                "916-323-9280","http://www.parks.ca.gov/?page_id=668",
                "California State Railroad Museum",R.drawable.trainmuseum));
        sightseeingArray.add(new SiteData(1,"1014 2nd St #200, Sacramento, CA 95814",
                "916-970-5226", "http://oldsacramento.com/about/history",
                "Old Sacramento", R.drawable.oldsac));

        return sightseeingArray;
    }

    public ArrayList<SiteData> getBusinessArray() {

        businessArray = new ArrayList<>();

        businessArray.add(new SiteData(2,"1518 Broadway, Sacramento, CA 95818",
                "916-441-0222","http://towercafe.com",
                "Tower Cafe",R.drawable.towercafe ));

        businessArray.add(new SiteData(2, "4800 Riverside blvd, Sacramento, CA 95822",
                "916-443-8400", "http://www.scottsseafood.net/",
                "Scott's Seafood", R.drawable.scottsseafood));

        businessArray.add(new SiteData(2,"1525 L St, Sacramento, CA 95818",
                "916-442-8899", "https://mixdowntown.net/",
                "Mix Downtown", R.drawable.mix));

        businessArray.add(new SiteData(2, "1116 15th St, Sacramento, CA 95814",
                "916-802-3036", "https://www.theparksac.com/",
                "The Park Sacramento",R.drawable.thepark ));

        businessArray.add(new SiteData(2,"2801 Franklin Blvd, Sacramento, CA 95818",
                "916-457-6646","http://gunthersicecream.com/",
                "Gunther’s Quality Ice Cream", R.drawable.gunthers));


        return businessArray;
    }

    public ArrayList<SiteData> getLocalEventArray() {
        localEventArray = new ArrayList<>();
        localEventArray.add(new SiteData(3,"1600 Exposition Blvd, Sacramento, CA 95815",
                "916-263-3247", "http://www.castatefair.org/special-events/",
                "California State Fair", R.drawable.statefair));

        localEventArray.add(new SiteData(3,"500 David J Stern Walk, Sacramento, CA 95814",
                "888-915-4647", "https://www.golden1center.com/events",
                "Golden 1 Center", R.drawable.sacarena));

        localEventArray.add(new SiteData(3, "1600 Exposition Blvd, Sacramento, CA 95815",
                "(916) 307-6100", "https://www.sacrepublicfc.com/",
                "Sacramento Republic FC", R.drawable.sacrep ));



        localEventArray.add(new SiteData(3, "1206 Front Street, Sacramento CA 95814",
                "916-446-1185","https://www.hornblower.com/home/sac",
                "Hornblower", R.drawable.hornblower));

        return localEventArray;
    }
}
