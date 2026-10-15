package androidx.core.graphics.drawable;

import B.b;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2678k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f2680b;

    /* renamed from: j, reason: collision with root package name */
    public String f2686j;

    /* renamed from: a, reason: collision with root package name */
    public int f2679a = -1;
    public byte[] c = null;
    public Parcelable d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f2681e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2682f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2683g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2684h = f2678k;

    /* renamed from: i, reason: collision with root package name */
    public String f2685i = null;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.graphics.drawable.IconCompat, androidx.versionedparcelable.CustomVersionedParcelable] */
    public static IconCompat a(int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        ?? customVersionedParcelable = new CustomVersionedParcelable();
        customVersionedParcelable.c = null;
        customVersionedParcelable.d = null;
        customVersionedParcelable.f2682f = 0;
        customVersionedParcelable.f2683g = null;
        customVersionedParcelable.f2684h = f2678k;
        customVersionedParcelable.f2685i = null;
        customVersionedParcelable.f2679a = 2;
        customVersionedParcelable.f2681e = i4;
        customVersionedParcelable.f2680b = "";
        customVersionedParcelable.f2686j = "";
        return customVersionedParcelable;
    }

    public final int b() {
        int i4 = this.f2679a;
        if (i4 != -1) {
            if (i4 == 2) {
                return this.f2681e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f2680b;
        if (i5 >= 28) {
            return b.d(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        }
    }

    public final Uri c() {
        int i4 = this.f2679a;
        if (i4 != -1) {
            if (i4 == 4 || i4 == 6) {
                return Uri.parse((String) this.f2680b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f2680b;
        if (i5 >= 28) {
            return b.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f2679a == -1) {
            return String.valueOf(this.f2680b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2679a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2679a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2680b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2680b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2686j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2681e);
                if (this.f2682f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2682f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2680b);
                break;
        }
        if (this.f2683g != null) {
            sb.append(" tint=");
            sb.append(this.f2683g);
        }
        if (this.f2684h != f2678k) {
            sb.append(" mode=");
            sb.append(this.f2684h);
        }
        sb.append(")");
        return sb.toString();
    }
}
