package J;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.C0153b;
import androidx.fragment.app.t;
import androidx.fragment.app.v;
import b.C0166d;
import b0.C0211x;
import b0.j0;
import b0.k0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f949a;

    public /* synthetic */ i(int i4) {
        this.f949a = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0316  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$BaseSavedState, J.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.fragment.app.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [b.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [b0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, b0.j0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, b0.k0] */
    /* JADX WARN: Type inference failed for: r8v9, types: [b.a, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r34) {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.i.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f949a) {
            case 0:
                return new j[i4];
            case 1:
                return new K1.a[i4];
            case 2:
                return new K1.d[i4];
            case 3:
                return new N1.h[i4];
            case 4:
                return new P1.b[i4];
            case 5:
                return new AdOverlayInfoParcel[i4];
            case 6:
                return new MediaBrowserCompat$MediaItem[i4];
            case 7:
                return new MediaDescriptionCompat[i4];
            case 8:
                return new MediaMetadataCompat[i4];
            case 9:
                return new RatingCompat[i4];
            case 10:
                return new MediaSessionCompat$QueueItem[i4];
            case 11:
                return new MediaSessionCompat$ResultReceiverWrapper[i4];
            case 12:
                return new MediaSessionCompat$Token[i4];
            case 13:
                return new ParcelableVolumeInfo[i4];
            case 14:
                return new PlaybackStateCompat[i4];
            case 15:
                return new androidx.activity.result.a[i4];
            case 16:
                return new androidx.activity.result.g[i4];
            case 17:
                return new C0153b[i4];
            case 18:
                return new t[i4];
            case 19:
                return new v[i4];
            case 20:
                return new C0166d[i4];
            case 21:
                return new C0211x[i4];
            case 22:
                return new j0[i4];
            case 23:
                return new k0[i4];
            case 24:
                return new b2.c[i4];
            case 25:
                return new GoogleSignInAccount[i4];
            case 26:
                return new com.google.android.material.datepicker.b[i4];
            case 27:
                return new com.google.android.material.datepicker.c[i4];
            case 28:
                return new com.google.android.material.datepicker.l[i4];
            default:
                return new C1664b[i4];
        }
    }
}
