package h2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q extends AbstractC1717a {
    public static final Parcelable.Creator<q> CREATOR = new e2.l(6);

    /* renamed from: o, reason: collision with root package name */
    public final int f13232o;

    /* renamed from: p, reason: collision with root package name */
    public final Account f13233p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13234q;

    /* renamed from: r, reason: collision with root package name */
    public final GoogleSignInAccount f13235r;

    public q(int i4, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f13232o = i4;
        this.f13233p = account;
        this.f13234q = i5;
        this.f13235r = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f13232o);
        AbstractC1654b.U(parcel, 2, this.f13233p, i4);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f13234q);
        AbstractC1654b.U(parcel, 4, this.f13235r, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
