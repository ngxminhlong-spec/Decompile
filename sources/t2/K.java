package t2;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K extends Exception {
    public K(int i4, String str, IOException iOException) {
        super(str, iOException);
    }

    public K(String str, int i4) {
        super(str);
    }

    public final B0.a a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new B0.a(getMessage(), 4);
    }
}
