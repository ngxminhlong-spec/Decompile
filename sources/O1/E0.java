package O1;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b0.RunnableC0203p;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.Y9;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E0 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle bundle = null;
        try {
            bundle = m2.c.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e4) {
            Y9.q("Failed to load metadata: Package name not found.", e4);
        } catch (NullPointerException e5) {
            Y9.q("Failed to load metadata: Null pointer exception.", e5);
        }
        if (C0874ln.f9465r == null) {
            C0874ln.f9465r = new C0874ln(12);
        }
        C0874ln c0874ln = C0874ln.f9465r;
        if (bundle == null) {
            Y9.p("Metadata was null.");
        } else {
            try {
                String str = (String) bundle.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) bundle.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                    try {
                        String str2 = (String) bundle.get("com.google.android.gms.ads.INTEGRATION_MANAGER");
                        if (str != null) {
                            if (!str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            Y9.m("Publisher provided Google AdMob App ID in manifest: ".concat(str));
                            if ((bool == null || !bool.booleanValue()) && ((AtomicBoolean) c0874ln.f9467p).compareAndSet(false, true)) {
                                new Thread(new RunnableC0203p(8, context, str)).start();
                            }
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            }
                            Y9.m("The Google Mobile Ads SDK is integrated by ".concat(String.valueOf(str2)));
                        }
                    } catch (ClassCastException e6) {
                        throw new IllegalStateException("The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value.", e6);
                    }
                } catch (ClassCastException e7) {
                    throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e7);
                }
            } catch (ClassCastException e8) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e8);
            }
        }
        if (bundle != null) {
            boolean z4 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION", false);
            boolean z5 = bundle.getBoolean("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING", false);
            if (z4) {
                Y9.m("com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled");
            }
            if (z5) {
                Y9.m("com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
