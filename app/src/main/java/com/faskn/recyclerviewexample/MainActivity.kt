package com.faskn.recyclerviewexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.GridView
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.category_items_layout.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.content_Category_recyclerView)
        recycler.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)


        // Burdan sonra aşağı bakma kör oluyorsun
        // Burdan sonra aşağı bakma kör oluyorsun
        // Burdan sonra aşağı bakma kör oluyorsun


        val categories = ArrayList<CategoriesDTO>()
        categories.add(CategoriesDTO("https://www.shareicon.net/download/2016/09/01/822725_user_512x512.png","Senin için"))
        categories.add(CategoriesDTO("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNb6KAhak0TUASceMFbSCwoUhFcPCla__6nw2QFHhiIRPeen6UEA","Güldürü"))
        categories.add(CategoriesDTO("https://www.walldevil.com/wallpapers/w01/547971-brz-cars-fr-s-gt-86-scion-scion-fr-s-subaru-brz-toyota-86.jpg","Araba"))
        categories.add(CategoriesDTO("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRRe1ZmUqQCHo_VzWRK0ALyLxAShAOLF0UFflxFEQNAFPnkN7V","Fitness"))
        categories.add(CategoriesDTO("https://images.wallpaperscraft.com/image/spices_seasonings_red_pepper_black_pepper_pepper_star_anise_onion_ginger_garlic_walnuts_bay_leaf_78738_300x168.jpg","Yemek"))
        categories.add(CategoriesDTO("http://s1.1zoom.me/b5050/934/DOTA_2_Magnus_Monsters_444888_1366x768.jpg","Oyun"))
        categories.add(CategoriesDTO("https://stoketravel.com/wp-content/uploads/2016/12/solo-travel-photo-.jpg","Seyahat"))


        var adapter = CustomAdapter(categories)
        recycler.adapter = adapter

        val feeds = ArrayList<FeedDTO>()

        feeds.add(FeedDTO("https://www.wallpapers.net/web/wallpapers/download-full-hd-colourful-lion-artwork-wallpaper/400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("https://www.muralswallpaper.com/app/uploads/Canyon-Wallpaper-Mural-Square-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://lab.890m.com/wp-content/uploads/2013/04/triforce-wallpaper-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("https://s8wallpapers.com/images/400x400/l8126owlroy_001-10100884004004634.jpg","Fotograf"))
        feeds.add(FeedDTO("https://s8wallpapers.com/images/400x400/galaxy-s8-wallpaper-2-1010088400400994.jpg","Fotograf"))
        feeds.add(FeedDTO("https://www.worldofwallpaper.com/media/catalog/product/cache/small_image/400x400/beff4985b56e3afdbeabfc89641a4582/w/o/wow008-metro-prism-geometric-triangle-wallpaper-navy-blue-gold-ea3.jpg","Fotograf"))
        feeds.add(FeedDTO("http://4.bp.blogspot.com/-J3cK5-tSMuE/VZy1jf_IcBI/AAAAAAAAAAs/_5JfV3a1nbM/s1600/10299663_315368755326712_694876952_n.jpg","Fotograf"))
        feeds.add(FeedDTO("https://s8wallpapers.com/images/400x400/galaxy-s9-wallpaper-18-101008840040010675.jpg","Fotograf"))
        feeds.add(FeedDTO("http://www.lol-wallpapers.com/wp-content/uploads/2018/06/Chibi-KaiSa-by-qiangwei01667-HD-Wallpaper-Background-Official-Art-Artwork-League-of-Legends-lol-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://happynewyear2018hdwallpapers.com/wp-content/uploads/2017/11/Happy-New-Year-2018-Colorfull-Full-HD-4K-Wallpaper.jpg","Fotograf"))
        feeds.add(FeedDTO("https://wallpaper-house.com/data/out/7/wallpaper2you_191292.jpg","Fotograf"))
        feeds.add(FeedDTO("http://www.logospike.com/wp-content/uploads/2015/11/400x400_Logo_03.jpg","Fotograf"))
        feeds.add(FeedDTO("https://static1.squarespace.com/static/512e6d67e4b0e0699d1444d6/512f7c17e4b012cdc28b802a/5134d3eae4b066ad5331805b/1362416619556/pirate_mickey-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://artisticthings.com/wp-content/uploads/2010/04/apreis6-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://www.eif.org.uk/wp-content/uploads/2018/02/banner-six-pitfalls_180221-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("https://www.wallpapers.net/web/wallpapers/download-full-hd-colourful-lion-artwork-wallpaper/400x400.jpg","Aslan"))
        feeds.add(FeedDTO("https://www.muralswallpaper.com/app/uploads/Canyon-Wallpaper-Mural-Square-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://lab.890m.com/wp-content/uploads/2013/04/triforce-wallpaper-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("https://s8wallpapers.com/images/400x400/l8126owlroy_001-10100884004004634.jpg","Fotograf"))
        feeds.add(FeedDTO("https://s8wallpapers.com/images/400x400/galaxy-s8-wallpaper-2-1010088400400994.jpg","Fotograf"))
        feeds.add(FeedDTO("https://www.worldofwallpaper.com/media/catalog/product/cache/small_image/400x400/beff4985b56e3afdbeabfc89641a4582/w/o/wow008-metro-prism-geometric-triangle-wallpaper-navy-blue-gold-ea3.jpg","Fotograf"))
        feeds.add(FeedDTO("http://4.bp.blogspot.com/-J3cK5-tSMuE/VZy1jf_IcBI/AAAAAAAAAAs/_5JfV3a1nbM/s1600/10299663_315368755326712_694876952_n.jpg","Fotograf"))
        feeds.add(FeedDTO("https://s8wallpapers.com/images/400x400/galaxy-s9-wallpaper-18-101008840040010675.jpg","Fotograf"))
        feeds.add(FeedDTO("http://www.lol-wallpapers.com/wp-content/uploads/2018/06/Chibi-KaiSa-by-qiangwei01667-HD-Wallpaper-Background-Official-Art-Artwork-League-of-Legends-lol-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://happynewyear2018hdwallpapers.com/wp-content/uploads/2017/11/Happy-New-Year-2018-Colorfull-Full-HD-4K-Wallpaper.jpg","Fotograf"))
        feeds.add(FeedDTO("https://wallpaper-house.com/data/out/7/wallpaper2you_191292.jpg","Fotograf"))
        feeds.add(FeedDTO("http://www.logospike.com/wp-content/uploads/2015/11/400x400_Logo_03.jpg","Fotograf"))
        feeds.add(FeedDTO("https://static1.squarespace.com/static/512e6d67e4b0e0699d1444d6/512f7c17e4b012cdc28b802a/5134d3eae4b066ad5331805b/1362416619556/pirate_mickey-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://artisticthings.com/wp-content/uploads/2010/04/apreis6-400x400.jpg","Fotograf"))
        feeds.add(FeedDTO("http://www.eif.org.uk/wp-content/uploads/2018/02/banner-six-pitfalls_180221-400x400.jpg","Fotograf"))





        val adapter2 = FeedAdapter(this,feeds)

        val gridFeed = findViewById<GridView>(R.id.content_Feed)

        gridFeed.adapter = adapter2




    }
}
