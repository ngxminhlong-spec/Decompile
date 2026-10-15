package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058pz {

    /* renamed from: a, reason: collision with root package name */
    public int f10060a;

    /* renamed from: b, reason: collision with root package name */
    public int f10061b;
    public int c;
    public Object d;

    public C1058pz() {
        this.c = 0;
        this.d = new C0860lF[100];
    }

    public C1058pz(AbstractC1012ow abstractC1012ow) {
        this.c = 0;
        Charset charset = Mz.f6292a;
        this.d = abstractC1012ow;
        abstractC1012ow.f9865b = this;
    }

    public static final void r(int i4) {
        if ((i4 & 3) != 0) {
            throw Oz.e();
        }
    }

    public static final void s(int i4) {
        if ((i4 & 7) != 0) {
            throw Oz.e();
        }
    }

    public void A(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Ez) {
            Ez ez = (Ez) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    ez.h(abstractC1012ow.m());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                ez.h(abstractC1012ow.m());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Integer.valueOf(abstractC1012ow.m()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Integer.valueOf(abstractC1012ow.m()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void B(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Ez) {
            Ez ez = (Ez) list;
            int i5 = this.f10060a & 7;
            if (i5 == 2) {
                int s4 = abstractC1012ow.s();
                r(s4);
                int k3 = abstractC1012ow.k() + s4;
                do {
                    ez.h(abstractC1012ow.n());
                } while (abstractC1012ow.k() < k3);
                return;
            }
            if (i5 != 5) {
                throw Oz.a();
            }
            do {
                ez.h(abstractC1012ow.n());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 == 2) {
                int s5 = abstractC1012ow.s();
                r(s5);
                int k4 = abstractC1012ow.k() + s5;
                do {
                    list.add(Integer.valueOf(abstractC1012ow.n()));
                } while (abstractC1012ow.k() < k4);
                return;
            }
            if (i6 != 5) {
                throw Oz.a();
            }
            do {
                list.add(Integer.valueOf(abstractC1012ow.n()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void a(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Wz) {
            Wz wz = (Wz) list;
            int i5 = this.f10060a & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int s4 = abstractC1012ow.s();
                s(s4);
                int k3 = abstractC1012ow.k() + s4;
                do {
                    wz.h(abstractC1012ow.t());
                } while (abstractC1012ow.k() < k3);
                return;
            }
            do {
                wz.h(abstractC1012ow.t());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int s5 = abstractC1012ow.s();
                s(s5);
                int k4 = abstractC1012ow.k() + s5;
                do {
                    list.add(Long.valueOf(abstractC1012ow.t()));
                } while (abstractC1012ow.k() < k4);
                return;
            }
            do {
                list.add(Long.valueOf(abstractC1012ow.t()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void b(List list) {
        int r4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof AbstractC1487zz) {
            throw new ClassCastException();
        }
        int i4 = this.f10060a & 7;
        if (i4 == 2) {
            int s4 = abstractC1012ow.s();
            r(s4);
            int k3 = abstractC1012ow.k() + s4;
            do {
                list.add(Float.valueOf(abstractC1012ow.i()));
            } while (abstractC1012ow.k() < k3);
            return;
        }
        if (i4 != 5) {
            throw Oz.a();
        }
        do {
            list.add(Float.valueOf(abstractC1012ow.i()));
            if (abstractC1012ow.b()) {
                return;
            } else {
                r4 = abstractC1012ow.r();
            }
        } while (r4 == this.f10060a);
        this.c = r4;
    }

    public void c(List list, InterfaceC0984oA interfaceC0984oA, C1315vz c1315vz) {
        int r4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        int i4 = this.f10060a;
        if ((i4 & 7) != 3) {
            throw Oz.a();
        }
        do {
            Dz a4 = interfaceC0984oA.a();
            n(a4, interfaceC0984oA, c1315vz);
            interfaceC0984oA.b(a4);
            list.add(a4);
            if (abstractC1012ow.b() || this.c != 0) {
                return;
            } else {
                r4 = abstractC1012ow.r();
            }
        } while (r4 == i4);
        this.c = r4;
    }

    public void d(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Ez) {
            Ez ez = (Ez) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    ez.h(abstractC1012ow.o());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                ez.h(abstractC1012ow.o());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Integer.valueOf(abstractC1012ow.o()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Integer.valueOf(abstractC1012ow.o()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void e(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Wz) {
            Wz wz = (Wz) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    wz.h(abstractC1012ow.u());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                wz.h(abstractC1012ow.u());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Long.valueOf(abstractC1012ow.u()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Long.valueOf(abstractC1012ow.u()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void f(List list, InterfaceC0984oA interfaceC0984oA, C1315vz c1315vz) {
        int r4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        int i4 = this.f10060a;
        if ((i4 & 7) != 2) {
            throw Oz.a();
        }
        do {
            Dz a4 = interfaceC0984oA.a();
            o(a4, interfaceC0984oA, c1315vz);
            interfaceC0984oA.b(a4);
            list.add(a4);
            if (abstractC1012ow.b() || this.c != 0) {
                return;
            } else {
                r4 = abstractC1012ow.r();
            }
        } while (r4 == i4);
        this.c = r4;
    }

    public void g(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Ez) {
            Ez ez = (Ez) list;
            int i5 = this.f10060a & 7;
            if (i5 == 2) {
                int s4 = abstractC1012ow.s();
                r(s4);
                int k3 = abstractC1012ow.k() + s4;
                do {
                    ez.h(abstractC1012ow.p());
                } while (abstractC1012ow.k() < k3);
                return;
            }
            if (i5 != 5) {
                throw Oz.a();
            }
            do {
                ez.h(abstractC1012ow.p());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 == 2) {
                int s5 = abstractC1012ow.s();
                r(s5);
                int k4 = abstractC1012ow.k() + s5;
                do {
                    list.add(Integer.valueOf(abstractC1012ow.p()));
                } while (abstractC1012ow.k() < k4);
                return;
            }
            if (i6 != 5) {
                throw Oz.a();
            }
            do {
                list.add(Integer.valueOf(abstractC1012ow.p()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void h(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Wz) {
            Wz wz = (Wz) list;
            int i5 = this.f10060a & 7;
            if (i5 != 1) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int s4 = abstractC1012ow.s();
                s(s4);
                int k3 = abstractC1012ow.k() + s4;
                do {
                    wz.h(abstractC1012ow.v());
                } while (abstractC1012ow.k() < k3);
                return;
            }
            do {
                wz.h(abstractC1012ow.v());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int s5 = abstractC1012ow.s();
                s(s5);
                int k4 = abstractC1012ow.k() + s5;
                do {
                    list.add(Long.valueOf(abstractC1012ow.v()));
                } while (abstractC1012ow.k() < k4);
                return;
            }
            do {
                list.add(Long.valueOf(abstractC1012ow.v()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void i(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Ez) {
            Ez ez = (Ez) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    ez.h(abstractC1012ow.q());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                ez.h(abstractC1012ow.q());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Integer.valueOf(abstractC1012ow.q()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Integer.valueOf(abstractC1012ow.q()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void j(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Wz) {
            Wz wz = (Wz) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    wz.h(abstractC1012ow.w());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                wz.h(abstractC1012ow.w());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Long.valueOf(abstractC1012ow.w()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Long.valueOf(abstractC1012ow.w()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void k(List list, boolean z4) {
        String z5;
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if ((this.f10060a & 7) != 2) {
            throw Oz.a();
        }
        if ((list instanceof Sz) && !z4) {
            Sz sz = (Sz) list;
            do {
                sz.m(w());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            do {
                if (z4) {
                    q(2);
                    z5 = abstractC1012ow.A();
                } else {
                    q(2);
                    z5 = abstractC1012ow.z();
                }
                list.add(z5);
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void l(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Ez) {
            Ez ez = (Ez) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    ez.h(abstractC1012ow.s());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                ez.h(abstractC1012ow.s());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Integer.valueOf(abstractC1012ow.s()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Integer.valueOf(abstractC1012ow.s()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void m(List list) {
        int r4;
        int i4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof Wz) {
            Wz wz = (Wz) list;
            int i5 = this.f10060a & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw Oz.a();
                }
                int k3 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    wz.h(abstractC1012ow.x());
                } while (abstractC1012ow.k() < k3);
                p(k3);
                return;
            }
            do {
                wz.h(abstractC1012ow.x());
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    i4 = abstractC1012ow.r();
                }
            } while (i4 == this.f10060a);
        } else {
            int i6 = this.f10060a & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw Oz.a();
                }
                int k4 = abstractC1012ow.k() + abstractC1012ow.s();
                do {
                    list.add(Long.valueOf(abstractC1012ow.x()));
                } while (abstractC1012ow.k() < k4);
                p(k4);
                return;
            }
            do {
                list.add(Long.valueOf(abstractC1012ow.x()));
                if (abstractC1012ow.b()) {
                    return;
                } else {
                    r4 = abstractC1012ow.r();
                }
            } while (r4 == this.f10060a);
            i4 = r4;
        }
        this.c = i4;
    }

    public void n(Object obj, InterfaceC0984oA interfaceC0984oA, C1315vz c1315vz) {
        int i4 = this.f10061b;
        this.f10061b = ((this.f10060a >>> 3) << 3) | 4;
        try {
            interfaceC0984oA.h(obj, this, c1315vz);
            if (this.f10060a == this.f10061b) {
            } else {
                throw Oz.e();
            }
        } finally {
            this.f10061b = i4;
        }
    }

    public void o(Object obj, InterfaceC0984oA interfaceC0984oA, C1315vz c1315vz) {
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        int s4 = abstractC1012ow.s();
        if (abstractC1012ow.f9864a >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int l4 = abstractC1012ow.l(s4);
        abstractC1012ow.f9864a++;
        interfaceC0984oA.h(obj, this, c1315vz);
        abstractC1012ow.B(0);
        abstractC1012ow.f9864a--;
        abstractC1012ow.a(l4);
    }

    public void p(int i4) {
        if (((AbstractC1012ow) this.d).k() != i4) {
            throw Oz.f();
        }
    }

    public void q(int i4) {
        if ((this.f10060a & 7) != i4) {
            throw Oz.a();
        }
    }

    public int t() {
        int i4 = this.c;
        if (i4 != 0) {
            this.f10060a = i4;
            this.c = 0;
        } else {
            i4 = ((AbstractC1012ow) this.d).r();
            this.f10060a = i4;
        }
        if (i4 == 0 || i4 == this.f10061b) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public synchronized void u(int i4) {
        int i5 = this.f10060a;
        this.f10060a = i4;
        if (i4 < i5) {
            v();
        }
    }

    public synchronized void v() {
        int i4 = this.f10060a;
        int i5 = AbstractC0751is.f9071a;
        int max = Math.max(0, ((i4 + 65535) / 65536) - this.f10061b);
        int i6 = this.c;
        if (max >= i6) {
            return;
        }
        Arrays.fill((C0860lF[]) this.d, max, i6, (Object) null);
        this.c = max;
    }

    public AbstractC0886lz w() {
        q(2);
        return ((AbstractC1012ow) this.d).y();
    }

    public void x(List list) {
        int r4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof AbstractC0630fz) {
            throw new ClassCastException();
        }
        int i4 = this.f10060a & 7;
        if (i4 != 0) {
            if (i4 != 2) {
                throw Oz.a();
            }
            int k3 = abstractC1012ow.k() + abstractC1012ow.s();
            do {
                list.add(Boolean.valueOf(abstractC1012ow.c()));
            } while (abstractC1012ow.k() < k3);
            p(k3);
            return;
        }
        do {
            list.add(Boolean.valueOf(abstractC1012ow.c()));
            if (abstractC1012ow.b()) {
                return;
            } else {
                r4 = abstractC1012ow.r();
            }
        } while (r4 == this.f10060a);
        this.c = r4;
    }

    public void y(List list) {
        int r4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if ((this.f10060a & 7) != 2) {
            throw Oz.a();
        }
        do {
            list.add(w());
            if (abstractC1012ow.b()) {
                return;
            } else {
                r4 = abstractC1012ow.r();
            }
        } while (r4 == this.f10060a);
        this.c = r4;
    }

    public void z(List list) {
        int r4;
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.d;
        if (list instanceof AbstractC1272uz) {
            throw new ClassCastException();
        }
        int i4 = this.f10060a & 7;
        if (i4 != 1) {
            if (i4 != 2) {
                throw Oz.a();
            }
            int s4 = abstractC1012ow.s();
            s(s4);
            int k3 = abstractC1012ow.k() + s4;
            do {
                list.add(Double.valueOf(abstractC1012ow.g()));
            } while (abstractC1012ow.k() < k3);
            return;
        }
        do {
            list.add(Double.valueOf(abstractC1012ow.g()));
            if (abstractC1012ow.b()) {
                return;
            } else {
                r4 = abstractC1012ow.r();
            }
        } while (r4 == this.f10060a);
        this.c = r4;
    }
}
