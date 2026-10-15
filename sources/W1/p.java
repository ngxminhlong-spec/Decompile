package W1;

import O1.r;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C1462za;
import com.google.android.gms.internal.ads.InterfaceC0246Ba;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.Oq;
import com.google.android.gms.internal.ads.Y9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p implements Mu {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2019o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0246Ba f2020p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f2021q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f2022r;

    public /* synthetic */ p(b bVar, InterfaceC0246Ba interfaceC0246Ba, boolean z4, int i4) {
        this.f2019o = i4;
        this.f2022r = bVar;
        this.f2020p = interfaceC0246Ba;
        this.f2021q = z4;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public final void mo4r(Object obj) {
        switch (this.f2019o) {
            case 0:
                b bVar = this.f2022r;
                Oq oq = bVar.f1955C;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    C1462za c1462za = (C1462za) this.f2020p;
                    Parcel Q3 = c1462za.Q();
                    Q3.writeTypedList(arrayList);
                    c1462za.G1(Q3, 1);
                    if (!bVar.f1956D && !this.f2021q) {
                        return;
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        Uri uri = (Uri) obj2;
                        if (b.R3(uri, bVar.f1967P, bVar.f1968Q)) {
                            oq.a(b.S3(uri, bVar.f1965M, "1").toString(), null);
                        } else {
                            if (((Boolean) r.d.c.a(AbstractC1066q6.F6)).booleanValue()) {
                                oq.a(uri.toString(), null);
                            }
                        }
                    }
                    return;
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                    return;
                }
            default:
                b bVar2 = this.f2022r;
                Oq oq2 = bVar2.f1955C;
                ArrayList arrayList2 = bVar2.f1966O;
                ArrayList arrayList3 = bVar2.N;
                List<Uri> list = (List) obj;
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (b.R3((Uri) it.next(), arrayList3, arrayList2)) {
                                bVar2.f1962J.getAndIncrement();
                            }
                        }
                    }
                    C1462za c1462za2 = (C1462za) this.f2020p;
                    Parcel Q4 = c1462za2.Q();
                    Q4.writeTypedList(list);
                    c1462za2.G1(Q4, 1);
                    if (!bVar2.f1957E && !this.f2021q) {
                        return;
                    }
                    for (Uri uri2 : list) {
                        if (b.R3(uri2, arrayList3, arrayList2)) {
                            oq2.a(b.S3(uri2, bVar2.f1965M, "1").toString(), null);
                        } else {
                            if (((Boolean) r.d.c.a(AbstractC1066q6.F6)).booleanValue()) {
                                oq2.a(uri2.toString(), null);
                            }
                        }
                    }
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public final void y(Throwable th) {
        switch (this.f2019o) {
            case 0:
                try {
                    InterfaceC0246Ba interfaceC0246Ba = this.f2020p;
                    String str = "Internal error: " + th.getMessage();
                    C1462za c1462za = (C1462za) interfaceC0246Ba;
                    Parcel Q3 = c1462za.Q();
                    Q3.writeString(str);
                    c1462za.G1(Q3, 2);
                    return;
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                    return;
                }
            default:
                try {
                    InterfaceC0246Ba interfaceC0246Ba2 = this.f2020p;
                    String str2 = "Internal error: " + th.getMessage();
                    C1462za c1462za2 = (C1462za) interfaceC0246Ba2;
                    Parcel Q4 = c1462za2.Q();
                    Q4.writeString(str2);
                    c1462za2.G1(Q4, 2);
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
        }
    }
}
