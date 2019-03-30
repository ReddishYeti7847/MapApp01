package com.example.user.mapapp01;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //マップタイプ等の設定
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
//        mMap.setTrafficEnabled(true);
//        mMap.setBuildingsEnabled(true);

        // マーカーを追加
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.828984, 140.734751)).title("青森"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.805702, 140.769485)).title("筒井"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.810069, 140.782475)).title("東青森"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.817911, 140.797756)).title("小柳"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.833919, 140.807246)).title("矢田前"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.846173, 140.817009)).title("野内"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.891364, 140.862356)).title("浅虫温泉"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.827944, 140.672123)).title("津軽新城"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.791202, 140.635012)).title("鶴ヶ坂"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.756667, 140.587853)).title("大釈迦"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.710677, 140.581121)).title("浪岡"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.856964, 140.690292)).title("油川"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.886971, 140.674380)).title("津軽宮田"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.903136, 140.672245)).title("奥内"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.917228, 140.665872)).title("左堰"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.931478, 140.662471)).title("後潟"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.949122, 140.6561521)).title("中沢"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.969590, 140.654623)).title("蓬田"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.987754, 140.652407)).title("郷沢"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.007906, 140.648370)).title("瀬辺地"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.038312, 140.642423)).title("蟹田"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.051639, 140.596724)).title("中小国"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.065800, 140.559833)).title("大平"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.145946, 140.514188)).title("津軽二股"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.163135, 140.507563)).title("大川平"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.179535, 140.490732)).title("今別"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.180563, 140.471868)).title("津軽浜名"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.185268, 140.444263)).title("三厩"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.670606, 140.543642)).title("北常盤"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.646712, 140.521288)).title("川部"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.621621, 140.497886)).title("撫牛子"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(40.599196, 140.485196)).title("弘前"));

        //追加情報付きマーカー
        MarkerOptions opt = new MarkerOptions();
        opt.position(new LatLng(35.681401, 139.767211));
        opt.title("東京");
        opt.snippet("新幹線駅");
        opt.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(opt);

        opt.position(new LatLng(40.827445, 140.693479));
        opt.title("新青森");
        Marker m2 = mMap.addMarker(opt);
        m2.showInfoWindow();

        opt.position(new LatLng(41.145170, 140.515754));
        opt.title("奥津軽いまべつ");
        mMap.addMarker(opt);


        //視点を移動 + ズーム
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(40.784442, 140.780567), 10));

        //現在地を表示
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION
            }, 1);
            return;
        }
        mMap.setMyLocationEnabled(true);

//        //ロングクリック
//        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
//            @Override
//            public void onMapLongClick(LatLng latLng) {
//                mMap.addMarker(new MarkerOptions()
//                        .position(latLng)
//                        .title("ここ")
//                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
//                );
//            }
//        });

//        //クリック
//        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
//            @Override
//            public void onMapClick(LatLng latLng) {
//                mMap.addMarker(new MarkerOptions()
//                        .position(latLng)
//                        .title("ここ")
//                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
//                );
//            }
//        });

        //InfoWindowのタップを検出
        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Toast.makeText(MapsActivity.this, marker.getTitle() + "駅を押したよ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
