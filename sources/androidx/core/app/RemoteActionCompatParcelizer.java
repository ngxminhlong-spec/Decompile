package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC1804a;
import m0.b;
import m0.c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1804a abstractC1804a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f2674a;
        boolean z4 = true;
        if (abstractC1804a.e(1)) {
            cVar = abstractC1804a.h();
        }
        remoteActionCompat.f2674a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f2675b;
        if (abstractC1804a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC1804a).f13977e);
        }
        remoteActionCompat.f2675b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (abstractC1804a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC1804a).f13977e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC1804a.g(remoteActionCompat.d, 4);
        boolean z5 = remoteActionCompat.f2676e;
        if (abstractC1804a.e(5)) {
            z5 = ((b) abstractC1804a).f13977e.readInt() != 0;
        }
        remoteActionCompat.f2676e = z5;
        boolean z6 = remoteActionCompat.f2677f;
        if (!abstractC1804a.e(6)) {
            z4 = z6;
        } else if (((b) abstractC1804a).f13977e.readInt() == 0) {
            z4 = false;
        }
        remoteActionCompat.f2677f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1804a abstractC1804a) {
        abstractC1804a.getClass();
        IconCompat iconCompat = remoteActionCompat.f2674a;
        abstractC1804a.i(1);
        abstractC1804a.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2675b;
        abstractC1804a.i(2);
        Parcel parcel = ((b) abstractC1804a).f13977e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC1804a.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC1804a.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f2676e;
        abstractC1804a.i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f2677f;
        abstractC1804a.i(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
