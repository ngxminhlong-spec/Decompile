package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import m0.AbstractC1804a;
import m0.b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1804a abstractC1804a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2679a = abstractC1804a.f(iconCompat.f2679a, 1);
        byte[] bArr = iconCompat.c;
        if (abstractC1804a.e(2)) {
            Parcel parcel = ((b) abstractC1804a).f13977e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = abstractC1804a.g(iconCompat.d, 3);
        iconCompat.f2681e = abstractC1804a.f(iconCompat.f2681e, 4);
        iconCompat.f2682f = abstractC1804a.f(iconCompat.f2682f, 5);
        iconCompat.f2683g = (ColorStateList) abstractC1804a.g(iconCompat.f2683g, 6);
        String str = iconCompat.f2685i;
        if (abstractC1804a.e(7)) {
            str = ((b) abstractC1804a).f13977e.readString();
        }
        iconCompat.f2685i = str;
        String str2 = iconCompat.f2686j;
        if (abstractC1804a.e(8)) {
            str2 = ((b) abstractC1804a).f13977e.readString();
        }
        iconCompat.f2686j = str2;
        iconCompat.f2684h = PorterDuff.Mode.valueOf(iconCompat.f2685i);
        switch (iconCompat.f2679a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2680b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f2680b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.f2680b = bArr3;
                iconCompat.f2679a = 3;
                iconCompat.f2681e = 0;
                iconCompat.f2682f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.f2680b = str3;
                if (iconCompat.f2679a == 2 && iconCompat.f2686j == null) {
                    iconCompat.f2686j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2680b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1804a abstractC1804a) {
        abstractC1804a.getClass();
        iconCompat.f2685i = iconCompat.f2684h.name();
        switch (iconCompat.f2679a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f2680b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f2680b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.f2680b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.f2680b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.f2680b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f2679a;
        if (-1 != i4) {
            abstractC1804a.j(i4, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC1804a.i(2);
            Parcel parcel = ((b) abstractC1804a).f13977e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC1804a.i(3);
            ((b) abstractC1804a).f13977e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f2681e;
        if (i5 != 0) {
            abstractC1804a.j(i5, 4);
        }
        int i6 = iconCompat.f2682f;
        if (i6 != 0) {
            abstractC1804a.j(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f2683g;
        if (colorStateList != null) {
            abstractC1804a.i(6);
            ((b) abstractC1804a).f13977e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2685i;
        if (str != null) {
            abstractC1804a.i(7);
            ((b) abstractC1804a).f13977e.writeString(str);
        }
        String str2 = iconCompat.f2686j;
        if (str2 != null) {
            abstractC1804a.i(8);
            ((b) abstractC1804a).f13977e.writeString(str2);
        }
    }
}
