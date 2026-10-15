package h2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f13144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13145b;
    public final boolean c;

    public F(String str, boolean z4) {
        y.e(str);
        this.f13144a = str;
        y.e("com.google.android.gms");
        this.f13145b = "com.google.android.gms";
        this.c = z4;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f13144a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f13145b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return y.m(this.f13144a, f4.f13144a) && y.m(this.f13145b, f4.f13145b) && y.m(null, null) && this.c == f4.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13144a, this.f13145b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.f13144a;
        if (str != null) {
            return str;
        }
        y.i(null);
        throw null;
    }
}
