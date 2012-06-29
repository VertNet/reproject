package org.vertnet;

import static com.google.common.base.Preconditions.*;

import org.gdal.gdal.*;

import java.awt.geom.Point2D;

public class Reproject {

    public static void main(String[] args) {
        System.out.println("Hello Reproject!");
        double lat = Double.valueOf(args[0]).doubleValue();
        double lon = Double.valueOf(args[1]).doubleValue();
        String datum = args[2];
        System.out.println(Reproject.toWgs84(lat, lon, datum));
    }

    public static Point2D.Double toWgs84(final double lat, final double lon, 
                                         final String datum) {
        checkNotNull(lat, "Lat is required.");
        checkNotNull(lon, "Lon is required.");
        checkNotNull(datum, "Datum is required");
        // TODO...
        return new Point2D.Double(lat, lon);
    }
}
